import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 1/25/17
 *          Day 10: Binary Numbers
 */
public class Solution {

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        char[] array = Integer.toString(n, 2).toCharArray();

        List<Integer> countersList = new LinkedList<>();
        int counter = 0;
        boolean isInterrupted = false;

        for (char c : array) {

            if (c == '1' && !isInterrupted) {
                counter++;
                continue;
            }

            if (c == '1') {
                countersList.add(counter);
                counter = 1;
                isInterrupted = false;
                continue;
            }

            if (c == '0' && !isInterrupted) {
                isInterrupted = true;
            }
        }
        countersList.add(counter);
        System.out.println(Collections.max(countersList));
    }
}
