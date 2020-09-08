import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int swapNum = bubbleSort(arr);
        System.out.println("Array is sorted in " + swapNum + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);

        sc.close();
    }

    private static int bubbleSort(int[] a) {
        int swapNum = 0;

        for (int ignored : a) {
            int numberOfSwaps = 0;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) break;
            swapNum += numberOfSwaps;
        }
        return swapNum;
    }

    private static void swap(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
}
