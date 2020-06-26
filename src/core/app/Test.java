package core.app;

import core.app.collections.ArrayListTest;
import core.app.collections.LinkedListTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {

    private int abc = 10;
    private static final Integer STR;

    static {
        STR = 5;
    }

    //позиция с которой удаляем
    private static int m = 0;
    //количество удаляемых элементов
    private static int n = 0;
    //количество элементов в списке
    private static final int size = 300000;
    //основной список (для удаления вызовом remove() и его копия для удаления путём перезаписи)
    private static ArrayList<Integer> initList, copyList;

    public static <T> void main(String[] args){
        List<Integer> list = new ArrayList<>();

        System.out.println(Test.STR);
        ArrayListTest.arrayListAddToStart(size);
        LinkedListTest.linkedListAddToStart(size);

        ArrayListTest.arrayListAddToMiddle(size);
        LinkedListTest.linkedListAddToMiddle(size);

        ArrayListTest.arrayListAddToEnd(size);
        LinkedListTest.linkedListAddToEnd(size);



    }

    private static void removeArrayList() {
        initList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            initList.add(i);
        }
        System.out.println("Список из 1.000.000 элементов заполнен");

        copyList = new ArrayList<>(initList);
        System.out.println("Создана копия списка\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("С какой позиции удаляем? > ");
            m = Integer.parseInt(br.readLine());
            System.out.print("Сколько удаляем? > ");
            n = Integer.parseInt(br.readLine());
        } catch(IOException e){
            System.err.println(e.toString());
        }
        System.out.println("\nВыполняем удаление вызовом remove()...");
        long start = System.currentTimeMillis();

        for (int i = m - 1; i < m + n - 1; i++) {
            initList.remove(i);
        }

        long finish = System.currentTimeMillis() - start;
        System.out.println("Время удаления с помощью вызова remove(): " + finish);
        System.out.println("Размер исходного списка после удаления: " + initList.size());

        System.out.println("\nВыполняем удаление путем перезаписи...\n");
        start = System.currentTimeMillis();

        removeEfficiently();

        finish = System.currentTimeMillis() - start;
        System.out.println("Время удаления путём смещения: " + finish);
        System.out.println("Размер копии списка:" + copyList.size());
    }
    private static void removeEfficiently(){
        /* если необходимо удалить все элементы, начиная с указанного,
         * то удаляем элементы с конца до m
         */
        if (m + n >= size){
            int i = size - 1;
            while (i != m - 1){
                copyList.remove(i);
                i--;
            }
        } else{
            //переменная k необходима для отсчёта сдвига начиная от места вставка m
            for (int i  = m + n, k = 0; i < size; i++, k++) {
                copyList.set(m + k, copyList.get(i));
            }

            /* удаляем ненужные элементы в конце списка
             * удаляется всегда последний элемент, так как время этого действия
             * фиксировано и не зависит от размера списка
             */
            int i = size - 1;
            while (i != size - n - 1){
                copyList.remove(i);
                i--;
            }
            //сокращаем длину списка путём удаления пустых ячеек
            copyList.trimToSize();
        }
    }

    private void getCBA() {
        ASD asd = new ASD();
        abc = asd.cba;
        abc = asd.getInnerCBA();
    }

    class ASD {

        private int cba = 20;

        void setI() {
            abc = 15;
        }

        int getInnerCBA() {
            return cba;
        }
    }
}
