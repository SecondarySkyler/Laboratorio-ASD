package Exercises;

import java.util.Scanner;

public class FractionalPeriod {


    public static int period(String s) {
        int count = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i+1))
                count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String scanned = in.nextLine(); //abcabcab
        String s = "abcabcab";
        System.out.print();

    }

}
