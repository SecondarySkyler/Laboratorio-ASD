package OrderingAlgorithm;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] a, int p, int q) {
        if (p < q) {
            int r = (p + q) / 2;
            mergeSort(a, p, r);
            mergeSort(a, r + 1, q);
            merge(a, p, r ,q);
        }
    }

    public static void merge (int[] a, int p, int r, int q) {

        int[] left = new int[r - p + 1];
        int[] right = new int[q - r];

        /* filling the left array */
        for (int i = 0; i < left.length; i++)
            left[i] = a[i];

        /* filling the right array */
        for (int j = 0; j < right.length; j++)
            right[j] = a[r + 1 + j];

        int i = 0;
        int j = 0;
        int k = p;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            a[k] = left[i];
            k++;
        }
        while (j < right.length) {
            a[k] = right[j];
            k++;
        }



    }



    public static void main(String[] args) {
        int[] a = {10, 3, 15, 2, 1, 4, 9, 0};
        int p = 0;
        int q = a.length - 1;
        mergeSort(a, p, q);
//        merge(a, p, 3, q);
    }
}
