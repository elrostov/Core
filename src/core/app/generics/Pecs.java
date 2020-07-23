package core.app.generics;

import java.util.ArrayList;
import java.util.List;

public class Pecs {

    private static List<Object> listObject = new ArrayList<>();
    private static List<Object> listObject1 = new ArrayList<>();
    private static List<Object> listObject2 = new ArrayList<>();
    private static List<? extends Object> listExtendsObject = new ArrayList<>();
    private static List<? super Object> listSuperObject = new ArrayList<>();
    private static List<Number> listNumber = new ArrayList<>();
    private static List<Number> listNumber1 = new ArrayList<>();
    private static List<Number> listNumber2 = new ArrayList<>();
    private static List<? extends Number> listExtendsNumber = new ArrayList<>();
    private static List<? super Number> listSuperNumber = new ArrayList<>();
    private static List<Integer> listInteger = new ArrayList<>();
    private static List<Integer> listInteger1 = new ArrayList<>();
    private static List<Integer> listInteger2 = new ArrayList<>();
    private static List<? extends Integer> listExtendsInteger = new ArrayList<>();
    private static List<? super Integer> listSuperInteger = new ArrayList<>();
    private static List<Long> listLong = new ArrayList<>();
    private static List<Long> listLong1 = new ArrayList<>();
    private static List<Long> listLong2 = new ArrayList<>();
    private static List<? extends Long> listExtendsLong = new ArrayList<>();
    private static List<? super Long> listSuperLong = new ArrayList<>();


    public static int nestedFactor(int x, int n) {
        x *= x;
        System.out.println("x: " + x);
        while (n > 0) {
            n--;
            System.out.println("n: " + n);
            x = nestedFactor(x, n);
        }
        return x;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//        int rez = nestedFactor(256, 4);
//        System.out.println(rez);
//        long l = 4_294_967_296L;
//        int i = 2_147_483_647 + 1;
//        System.out.println(i);

        ;

//        listObject = listNumber; // 1
//        listObject = new ArrayList<Number>(); // 2
//        listNumber = listInteger; // 3
//        listNumber = new ArrayList<Long>(); // 4

        ;

//        listExtendsObject = listInteger; // 5
//        listExtendsObject = listObject; // 6
//        listSuperObject = listObject; // 7
//        listSuperObject = listLong; // 8
//        listExtendsNumber = listObject; // 9
//        listExtendsNumber = listInteger; // 10
//        listSuperNumber = listLong; // 11
//        listSuperNumber = listObject; // 12
//        listExtendsInteger = listObject; // 13
//        listSuperInteger = listNumber; // 14
//        listExtendsLong = listNumber; // 15
//        listSuperLong = listObject; // 16
//        listSuperLong = listNumber; // 17

        ;

//        listExtendsObject = listSuperNumber; // 18
//        listExtendsInteger = listSuperObject; // 19
//        listSuperObject = listSuperLong; // 20
//        listSuperLong = listSuperObject; // 21
//        listSuperLong = listExtendsObject; // 22
//        listSuperInteger = listSuperObject; // 23
//        listSuperInteger = listExtendsNumber; // 24
//        listSuperInteger = listExtendsInteger; // 25
//        listExtendsNumber = listSuperNumber; // 26

        ;

//        copyNumber(listObject1, listObject2); // 27
//        copyNumber(listNumber1, listNumber2); // 28
//        copyNumber(listInteger1, listInteger2); // 29
//        copyNumber(listLong1, listLong2); // 30
//        copyNumber(listInteger1, listObject2); // 31
//        copyNumber(listObject1, listInteger2); // 32
//
//        listNumber1.add(new Long(6)); // 33
//        listNumber1.add(new Integer(6)); // 34
//
//        listObject1 = listInteger1; // 35
//        listNumber1 = listLong1; // 36
//
//        copy(listObject1, listLong2); // 37
//        Pecs.copy(listNumber1, listInteger2);
    }

//    public static void copyNumber(List<? super Number> dest, List<? extends Number> src) { // 38
////        Object o1 = src.get(0); // 39
////        Number n1 = src.get(0); // 40
////        Integer i1 = src.get(0); // 41
////        Long l1 = src.get(0); // 42
////
////        src.add(new Object()); // 43
////        src.add(new Integer(5)); // 44
////        src.add(new Long(5)); // 45
////        src.add(null); // 46
////
////        src = listObject1; // 47
////        src = listNumber1; // 48
////        src = listInteger1; // 49
////        src = listLong1; // 50
////
////        Number n2 = dest.get(0); // 51
////        Object o2 = dest.get(0); // 52
////        Integer i2 = dest.get(0); // 53
////        Long l2 = dest.get(0); // 54
////
////        dest.add(10); // 55
////        dest.add(20.4); // 56
////        dest.add(30L); // 57
////
////        dest = listObject1; // 58
//    }











//    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
////        src.get(0); // 59
////        Number n = (Integer) src.get(0); // 60
////        src.add(new Object()); // 61
////        src.add(null); // 62
////
////        dest.add(src.get(0)); // 63
////        dest.add(null); // 64
////        Object o = dest.get(0); // 65
//    }

}
