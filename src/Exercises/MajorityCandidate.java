package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class MajorityCandidate {

    public static int extractMax (int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void countingSort(int[]  a) {
        int max = extractMax(a);
        int[] c = new int[max + 1];
        boolean found = false;

        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }

        // Array c gets populate by the occurrences of elements of a
        for (int i = 0; i < a.length; i++) {
            c[a[i]] = c[a[i]] + 1;
        }

        for (int i = 0; i < c.length; i++) {
            int midA = (a.length / 2) + 1;
            if (c[i] >= midA) {
                System.out.print(i);
                found = true;
            }
        }
        if (!found){
            System.out.print("No majority");
        }


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

        countingSort(resultScan);
    }
}
