package ex_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        String[] strArr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "str_" + (i+1);
        }

        convertToArrayList(arr);
        convertToArrayList(strArr);
    }

    static <T> void convertToArrayList(T[] a) {
        ArrayList<T> alist = new ArrayList<T>();
        for (int i = 0; i < a.length; i++) {
            alist.add(a[i]);
        }
        System.out.println(alist);
    }
}
