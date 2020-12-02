package OrderingAlgorithm;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            int value = a[i];
            while (j >= 0 && a[j] > value) {
                a[j + 1] = a[j];
                j--;
                a[j + 1] = value;
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {12, 4, 6,23,78, 0, 4};
        int[] b = {3, 7, 4, 9, 5, 2, 6, 1};
//        insertionSort(a);
        insertionSort(b);
        System.out.println(Arrays.toString(a));
        System.out.print(Arrays.toString(b));
    }
}
