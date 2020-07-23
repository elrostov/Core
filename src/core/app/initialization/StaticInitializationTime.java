package core.app.initialization;

public class StaticInitializationTime {
    public static class C {
        static int i = value();
        static int value() {
            System.out.println("C.i initialized");
            System.out.println(i);
            return 1;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Before class loading");
        Class.forName(C.class.getName());
        System.out.println(C.i);
        System.out.println("After class loading");
    }
}
