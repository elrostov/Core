package core.app.serialize;

import org.junit.jupiter.api.Test;

import java.io.*;

public class SerializableTestOne {

    public static void main(String[] args) {
        ObjectWithStaticField object1 = new ObjectWithStaticField("ObjectOne");

        System.out.println("new " + object1); // {static int count=1, name='ObjectOne'}

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
        System.out.println("another new" + object2); // {static int count=2, name='ObjectTwo'}

        // десериализуем первый объект
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream("ObjectWithStaticField"))) {
            ObjectWithStaticField.deserializeStatic(objectInputStream);
            ObjectWithStaticField desObject1 = (ObjectWithStaticField) objectInputStream.readObject();
            System.out.println("deserial-d" + desObject1); // {static int count=1, name='ObjectOne'}
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        System.out.println("same as before Obj 2" + object2);

        // создаем еще один объект
        System.out.println(object1);
        System.out.println(object2);
        ObjectWithStaticField object3 = new ObjectWithStaticField("ObjectThree");
        System.out.println(object3); // {static int count=2, name='ObjectThree'}
    }


    @Test
    void one() {
        ObjectWithStaticField object1 = new ObjectWithStaticField("ObjectOne");

        System.out.println("new " + object1); // {static int count=1, name='ObjectOne'}

        // сериализуем объект
        try (ObjectOutputStream objectOutputStreams =
                     new ObjectOutputStream(new FileOutputStream("ObjectWithStaticField"))) {
            ObjectWithStaticField.serializeStatic(objectOutputStreams);
            objectOutputStreams.writeObject(object1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void two() {
        // десериализуем первый объект
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream("ObjectWithStaticField"))) {
            ObjectWithStaticField.deserializeStatic(objectInputStream);
            ObjectWithStaticField desObject1 = (ObjectWithStaticField) objectInputStream.readObject();
            System.out.println("deserial-d" + desObject1); // {static int count=1, name='ObjectOne'}
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}

class ObjectWithStaticField implements Serializable {

    private static int count;
    private static String string;
    private String name;

    ObjectWithStaticField(String name) {
        System.out.println(" In constructor");
        this.name = name;
        count = 100;
        string = "w89jbfk";
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
                ", string='" + string + '\'' +
                '}';
    }
}
