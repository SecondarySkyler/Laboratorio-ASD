package Exercises;

import java.util.Arrays;

public class twoSum {


    /**
     * return the 2 indices i and j so that a[i] + a[j] = k
     * @param a array where to find the 2 indices
     * @param k the key
     *          TIME COMPLEXITY O(n^2)
     */
    public static void trovaIndici(int[] a, int k) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] +  a[j] == k) {
                    System.out.println(""+ i + ", " + j);
                }
            }
        }
        System.out.println("not found");
    }

    /**
     * Search two indices i and j so that a[i] + a[j] = k
     * @param a the array where to search
     * @param key the key to find
     *            TIME COMPLEXITY O(n)
     */
    public static void twoSum(int[]a , int key) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            if (a[i] + a[j] == key) {
                System.out.println("" + i + ", " + j);
                return;
            }
            else if (a[i] + a[j] < key)
                i++;
            else
                j--;
        }
        System.out.println("not found");
    }

//    public static int[] sort(int[] a) {
//        int i = 0;
//        int j = a.length - 1;
//
//        while (i < j) {
//            if (a[i] < a[j] && a[i] >= 0){
//                j--;
//            } else if (a[i] < a[j]) {
//                i++;
//            } else if (a[i] > a[j]) {
//                swap(a, i, j);
//                j--;
//            }
//        }
//        return a;
//    }
//
//    public static void swap(int[] a, int i, int j) {
//        int temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//    }


    public static void main(String[] args) {
        int[] a = {3, 7, 8, 11, 15, 20, 24};
        int key = 23;
        trovaIndici(a,key);
        twoSum(a,key);
//        int[] a = {5, 7, -2, -9, 2, -4, 3, 1, -3, -6};
//        System.out.print(Arrays.toString(sort(a)));

    }
}
