import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 1/21/17
 *          Day 8: Dictionaries and Maps
 */

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            System.out.println(phoneBook.containsKey(s) ? s + "=" + phoneBook.get(s) : "Not found");
        }
        in.close();
    }
}
