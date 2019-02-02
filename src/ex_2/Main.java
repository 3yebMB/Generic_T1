package ex_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        String[] strArr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "str_" + Integer.toString(i+1);
        }

        changeElementsPosition(arr, 1, 4);
        changeElementsPosition(strArr, 2, 3);

        System.out.println(Arrays.asList(arr));
        System.out.println(Arrays.asList(strArr));
    }

    static <T> void changeElementsPosition(T[] a, int b, int c) {
        T tmp;

        tmp = a[b-1];
        a[b-1] = a[c-1];
        a[c-1] = tmp;
    }
}
