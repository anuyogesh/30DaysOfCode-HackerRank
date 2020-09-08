import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 1/25/17
 *          Day 11: 2D Arrays
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[6][6];
        List<Integer> sums = new LinkedList<>();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                sums.add(
                        a[i][j] +
                                a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] +
                                a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1]
                );
            }
        }
        System.out.println(Collections.max(sums));
    }
}
