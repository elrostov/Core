package core.app.nestedClasses;

public class Demo {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        OuterClass outerClass = innerClass.getOuterClass();
        System.out.println(outerClass);
        System.out.println(innerClass);

        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
    }
}
