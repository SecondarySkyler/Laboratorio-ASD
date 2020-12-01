package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class MajorityCandidate {

//    /**
//     * Method to find the max value in an array
//     * @param a the array to scan
//     * @return the max so for every index max > a[i]
//     */
//    public static int extractMax (int[] a) {
//        int max = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            }
//        }
//        return max;
//    }
//
//    /**
//     * Method that use a piece of algorithm from Counting Sort, used to search for a majority candidate in an array.
//     * a[i] is a majority candidate if the number of the occurrences of a[i] is >= (a.length / 2) + 1
//     * @param a the array where to search for the majority candidate
//     */
//    public static void countingSort(int[]  a) {
//        int max = extractMax(a);
//        int[] c = new int[max + 1];
//        boolean found = false;
//
//        for (int i = 0; i < c.length; i++) {
//            c[i] = 0;
//        }
//
//        // Array c gets populate by the occurrences of elements of a
//        for (int i = 0; i < a.length; i++) {
//            c[a[i]] = c[a[i]] + 1;
//        }
//
//        for (int i = 0; i < c.length; i++) {
//            int midA = (a.length / 2) + 1;
//            if (c[i] >= midA) {
//                System.out.print(i);
//                found = true;
//            }
//        }
//        if (!found){
//            System.out.print("No majority");
//        }
//
//
//    }


    private static int findCandidate(int[] a) {
        int majority = 0;
        int count = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[majority] == a[i]) {
                count++;
            } else {
                count--;
                if (count == 0){
                    majority = i;
                    count = 1;
                }
            }
        }
        return a[majority];
    }

    public static void Majority(int[] a) {
        int candidate = findCandidate(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == candidate)
                count++;
        }
        if (count > a.length / 2)
            System.out.print(candidate);
        else
            System.out.print("No majority");
    }



    // requires an input Scanner object (e.g. in = new Scanner(System.in); )
    public static ArrayList<Integer> scanArray(Scanner in) {
        // scan line of text
        String line = in.nextLine();

        // convert line of text into array of strings (tokens)
        String[] tokens = line.split(" ");

        // convert array of strings into array of integers
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (String token : tokens) {
            if (!token.isEmpty()) // some tokens may be empty (e.g. with trailing spaces)
                arr.add(Integer.parseInt(token));
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> scanned = scanArray(in);
        int[] resultScan = new int[scanned.size()];
        for (int i = 0; i < scanned.size(); i++) {
            resultScan[i] = scanned.get(i).intValue();
        }

        Majority(resultScan);

    }
}
