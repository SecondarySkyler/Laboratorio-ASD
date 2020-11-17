package Exercises;

public class nSum {

    public static void rangeSum(int[] a, int k) {

        if (a.length ==  0)
            System.out.println("null array");

        int i = 0;
        int j = 0;
        int count = a[0];
        while (j < a.length) {
            if (count == k) {
                System.out.println("" + i + ", " + j);
                return;
            }
            else if (count < k) {
                j++;
                count = count + a[j];
            }
            else {
                i++;
                count = count - a[i - 1];
            }
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        int[] a = {5, 0, 3, 1, 13, 7, 5};
        int key = 20;
        rangeSum(a,key);

    }
}
