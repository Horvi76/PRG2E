package methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Visibility {

    static void something(int a){
        a = 10;
        System.out.println(a);
    }

    static void somethingElse(int[] array){
        array[1] += 10;
        System.out.println(array[1]);
    }

    static void sort(int[] array){
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        something(a);
        System.out.println(a);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int i = 5;
        System.out.println(i);
//
//        int[] array = {10, 5};
//        System.out.println(array);
//        System.out.println(array[1]);
//        somethingElse(array);
//        int f;
//        byte b;
//        long l;
//        boolean tr;
//        short s;
//        float ff;
//        double d;
//        char c;
//        char[] cArr;
//        String neco;
//        System.out.println(array[1]);
        Integer ia = 5;
        ArrayList<ArrayList<Integer>> list;
        int[] toSort = {5,6,7,1,2,9};
        System.out.println(Arrays.toString(toSort));
        sort(toSort);
        System.out.println(Arrays.toString(toSort));
    }
}
