package core.app.nestedClasses;

public class OuterClass {
    private int i = 1;
    private static int j = 2;

    public static class InnerStaticClass {
        private int ii = 11;
        private static int jj = 22;
    }

    public class InnerClass {
        private int iii = 111;
//        static {
//
//        }
//        private static int jjj = 222;

        public OuterClass getOuterClass() {
            return OuterClass.this;
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new OuterClass().new InnerClass();
        OuterClass outerClass = innerClass.getOuterClass();
        System.out.println(outerClass);
        System.out.println(innerClass);
    }
}
