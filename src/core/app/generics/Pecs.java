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
/*        int rez = nestedFactor(256, 4);
        System.out.println(rez);
        long l = 4_294_967_296L;
        int i = 2_147_483_647 + 1;
        System.out.println(i);*/

//        listObject = listNumber; //-
//        listObject = new ArrayList<Number>(); //-
//        listNumber = listInteger; //-
//        listNumber = new ArrayList<Long>(); //-

        ;

//        listExtendsObject = listInteger; //+
//        listExtendsObject = listObject; //+
//        listSuperObject = listObject; //+
//        listSuperObject = listLong; //-
//        listExtendsNumber = listObject; //-
//        listExtendsNumber = listInteger; //+
//        listSuperNumber = listLong; //-
//        listSuperNumber = listObject; //+
//        listExtendsInteger = listObject; //-
//        listSuperInteger = listNumber; //+
//        listExtendsLong = listNumber; //-
//        listSuperLong = listObject; //+
//        listSuperLong = listNumber; //+

        ;

//        listExtendsObject = listSuperNumber; //+
//        listExtendsInteger = listSuperObject; //-
//        listSuperObject = listSuperLong; //-
//        listSuperLong = listSuperObject; //+
//        listSuperLong = listExtendsObject; //+
//        listSuperInteger = listSuperObject; //+
//        listSuperInteger = listExtendsNumber; //+-
//        listSuperInteger = listExtendsInteger; //+-
//        listExtendsNumber = listSuperNumber; //+-

        ;

//        copyNumber(listObject1, listObject2); //-
//        copyNumber(listNumber1, listNumber2); //+
//        copyNumber(listInteger1, listInteger2); //-
//        copyNumber(listLong1, listLong2); //-
//        copyNumber(listInteger1, listObject2); //-
//        copyNumber(listObject1, listInteger2); //+
//
//        listNumber1.add(new Long(6)); //- +???
//        listNumber1.add(new Integer(6)); //-+ ???
//
//        listObject1 = listInteger1; //-
//        listNumber1 = listLong1; //-
//
//        copy(listObject1, listLong2); //+
//        Pecs.copy(listNumber1, listInteger2);
    }

    public static void copyNumber(List<? super Number> dest, List<? extends Number> src) { //List<Long>
//        Object o1 = src.get(0); //+
//        Number n1 = src.get(0); //+
//        Integer i1 = src.get(0); //+-
//        Long l1 = src.get(0); //-
//
//        src.add(new Object()); //-
//        src.add(new Integer(5)); //-
//        src.add(new Long(5)); //-
//        src.add(null); //+
//
//        src = listObject1; //-
//        src = listNumber1; //-
//        src = listInteger1; //-
//        src = listLong1; //-
//
//        Number n2 = dest.get(0); //-
//        Object o2 = dest.get(0); //-
//        Integer i2 = dest.get(0); //-
//        Long l2 = dest.get(0); //-
//
//        dest.add(10); //+
//        dest.add(20.4); //+
//        dest.add(30L); //+
//
//        dest = listObject1; //+
    }











    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
//        src.get(0); //+
//        Number n = (Integer) src.get(0); //+
//        src.add(new Object()); //-
//        src.add(null); //+
//
//        dest.add(src.get(0)); //+
//        dest.add(null); //-
//        Object o = dest.get(0); //-
    }


    public static void copyNumber2(
            List<? super Number> consumer, // List<Number>, List<Object>
            List<? extends Number> producer // List<Number>, List<Integer>, List<Long> ...
    ) {
//        Object o1 = producer.get(0);
//        Number n1 = producer.get(0);
//        Integer i1 = producer.get(0);
//        Long l1 = producer.get(0);
//
//        producer.add(new Object());
//        producer.add(new Integer(5));
//        producer.add(new Long(5));
//        producer.add(null);
//
//        producer = listObject1;
//        producer = listNumber1;
//        producer = listInteger1;
//        producer = listLong1;
//
//        Number n2 = consumer.get(0);
//        Object o2 = consumer.get(0);
//        Integer i2 = consumer.get(0);
//        Long l2 = consumer.get(0);
//
//        consumer.add(10);
//        consumer.add(20.4);
//        consumer.add(30L);
//        consumer.add(null);
//
//        consumer = listObject1;
    }
}
