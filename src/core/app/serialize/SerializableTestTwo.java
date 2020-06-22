package core.app.serialize;

import java.io.*;

public class SerializableTestTwo {

    public static void main(String[] args) {

        ClassWithStatic firstObject = new ClassWithStatic("FirstObject");
        System.out.println(firstObject.toString()); // name= FirstObject, count= 1

        // сериализуем объект со статическим полем count
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objectToSerialize"))) {
            oos.writeObject(firstObject);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // создаем еще 1 объект, значение статической переменной count увеличивается на 1
        ClassWithStatic secondObject = new ClassWithStatic("SecondObject");
        System.out.println(secondObject.toString()); // name= SecondObject, static int count = 2

        // десериализуем объект со статическим полем count, значение которого было 1
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objectToSerialize"))) {
            ClassWithStatic thirdObject = (ClassWithStatic) ois.readObject();
            System.out.println(thirdObject.toString()); // name= FirstObject, static int count = 1
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class ClassWithStatic implements Serializable {
    private static int count = 0;
    private String name;

    ClassWithStatic(String name) {
        this.name = name;
        count++;
    }
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(count);
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        count = (int) stream.readObject();
    }

    @Override
    public String toString() {
        return "name= " + name + ", static int count = " + count;
    }
}

