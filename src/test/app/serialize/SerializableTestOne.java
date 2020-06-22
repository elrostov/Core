package test.app.serialize;

import java.io.*;

public class SerializableTestOne {
    public static void main(String[] args) {
        ObjectWithStaticField object1 = new ObjectWithStaticField("ObjectOne");
        System.out.println(object1); // {static int count=1, name='ObjectOne'}

        // сериализуем объект
        try (ObjectOutputStream objectOutputStreams =
                     new ObjectOutputStream(new FileOutputStream("ObjectWithStaticField"))) {
            ObjectWithStaticField.serializeStatic(objectOutputStreams);
            objectOutputStreams.writeObject(object1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // создаем еще один объект
        ObjectWithStaticField object2 =
                new ObjectWithStaticField("ObjectTwo");
        System.out.println(object2); // {static int count=2, name='ObjectTwo'}

        // десериализуем первый объект
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream("ObjectWithStaticField"))) {
            ObjectWithStaticField.deserializeStatic(objectInputStream);
            ObjectWithStaticField desObject1 = (ObjectWithStaticField) objectInputStream.readObject();
            System.out.println(desObject1); // {static int count=1, name='ObjectOne'}
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        // создаем еще один объект
        ObjectWithStaticField object3 = new ObjectWithStaticField("ObjectThree");
        System.out.println(object3); // {static int count=2, name='ObjectThree'}
    }
}

class ObjectWithStaticField implements Serializable {

    private static int count = 0;
    private String name;

    ObjectWithStaticField(String name) {
        this.name = name;
        count++;
    }

    public static void serializeStatic(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(count);
    }

    public static void deserializeStatic(ObjectInputStream objectInputStream) throws IOException {
        count = objectInputStream.readInt();
    }

    @Override
    public String toString() {
        return "{" +
                "count=" + count +
                ", name='" + name + '\'' +
                '}';
    }
}
