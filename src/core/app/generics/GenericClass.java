package core.app.generics;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

public class GenericClass<T> {

//    private Class<T> clazz;
//
//    GenericClass(Class<T> clazz) {
//        this.clazz = clazz;
//    }

//    public void printType() {
//        System.out.println(clazz);
//    }

    ;

//    private T t; // 1
//
//    private <W> W w; // 2
//
//    private W w; // 3
//       // 4
//    public <Z> void anton(Z data, int num1) {
//    }
//       // 5
//    public static <Z> void setData2(Z data, int num1) {
//    }
//       // 6
//    GenericClass(T t) {
//    }
//       // 7
//    <T> GenericClass(T t) {
//    }
//       // 8
//    <Z> GenericClass(Z z) {
//    }
//       // 9
//    <Z> GenericClass() {
//    }
//       // 10
//    <T> GenericClass(T t) {
//    }
//       // 11
//    <U> GenericClass() {
//    }
//       // 12
//    public GenericClass(T t) {
//    }
//       // 13
//    public void setData3(T t) {
//    }
//       // 14
//    public <T> void setData4(T t) {
//    }
//       // 15
//    public static <Y,T extends Number & Comparable & Runnable> void setData5(Y y, T t) {
//    }
//       // 16
//    public static <M,W extends Cloneable & Integer & Serializable> void setData5(M m, W w) {
//    }
}
