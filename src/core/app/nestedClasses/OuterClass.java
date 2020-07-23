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

            class LocalClass{

            }

            LocalClass localClass = new LocalClass();

            return OuterClass.this;
        }
    }
}
