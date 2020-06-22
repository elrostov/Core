package core.app.generics;

import java.lang.reflect.ParameterizedType;

public class GenericClass<T> {

    private Class<T> clazz;

    GenericClass(Class<T> clazz) {
        this.clazz = clazz;
    }


    public void printType() {
        System.out.println(clazz);
    }
//    private T t; //-
//
//    private <W> W w; //-
//
//    private W w; //-
//       //+
//    public <Z> void anton(Z data, int num1) {
//    }
//       //+
//    public static <Z> void setData2(Z data, int num1) {
//    }
//       //-
//    GenericClass(T t) {
//    }
//       //+
//    <T> GenericClass(T t) {
//    }
//       //+
//    <Z> GenericClass(Z z) {
//    }
//       //+
//    <Z> GenericClass() {
//    }
//       //+
//    <T> GenericClass(T t) {
//    }
//       //+
//    <U> GenericClass() {
//    }
//       //-
//    public GenericClass(T t) {
//    }
//       //-
//    public void setData3(T t) {
//    }
//       //+
//    public <T> void setData4(T t) {
//    }
//       //-
//    public static <Y,T extends Number & Comparable & Runnable> void setData5(Y y) {
//    }
}
