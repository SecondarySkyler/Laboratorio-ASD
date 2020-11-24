package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxDifference {


    public static Integer[] maxDiff(Integer[] v) {
        int max = 0;
        Integer [] result = new Integer[2];
        if (v.length == 1) {
            result[0] = 0;
            result[1] = 0;
        }
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 1; j < v.length; j++) {
                if (i <= j) {
                    if (v[j] - v[i] > max) {
                        max = v[j] - v[i];
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }

        }
        return result;
    }

    /**
     * This algorithm is effective only if all the elements of the array are lower
     * than the dimension of the array;
     * Otherwise the algorithm will take O(n + max) and if max is extremely high
     * This will take a time complexity of O(max)
     */
    public static Integer[] maxDifference(Integer[] v) {
        int max = 0;
        Integer [] result = new Integer[2];
        if (v.length == 1) {
            result[0] = 0;
            result[1] = 0;
        }

        int i = 0;
        int j = v.length - 1;

        while (i < j) {
            if (v[j] < v[i]) {
                i++;
                j--;
            } else {
                int newMax = v[j] - v[i];
                 if (newMax > max) {
                     max = newMax;
                     result[0] = i;
                     result[1] = j;
                 }
                 i++;
                 j--;
            }

        }
    return result;
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
        ArrayList<Integer> scan = scanArray(in);
        Integer[] scanned = scan.toArray(new Integer[scan.size()]);

        Integer[] res = maxDifference(scanned);
        System.out.print(Arrays.toString(res));
    }
}
