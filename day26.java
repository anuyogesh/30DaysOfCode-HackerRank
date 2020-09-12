import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 2/25/17
 *          Day 26: Nested Logic
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int actualDay = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();
        int dueDay = sc.nextInt();
        int dueMonth = sc.nextInt();
        int dueYear = sc.nextInt();

        GregorianCalendar actualDate = new GregorianCalendar(actualYear, actualMonth - 1, actualDay);
        GregorianCalendar dueDate = new GregorianCalendar(dueYear, dueMonth - 1, dueDay);

        System.out.println(calculateFine(actualDate, dueDate));

        sc.close();
    }

    private static int calculateFine(GregorianCalendar actualDate, GregorianCalendar dueDate) {
        if (actualDate.before(dueDate) || actualDate.compareTo(dueDate) == 0) return 0;

        if (actualDate.get(Calendar.YEAR) > dueDate.get(Calendar.YEAR)) return 10000;

        if (actualDate.get(Calendar.MONTH) == dueDate.get(Calendar.MONTH) && actualDate.get(Calendar.DAY_OF_MONTH) > dueDate.get(Calendar.DAY_OF_MONTH)) {
            int days = actualDate.get(Calendar.DAY_OF_MONTH) - dueDate.get(Calendar.DAY_OF_MONTH);
            return 15 * days;
        }

        if (actualDate.get(Calendar.YEAR) == dueDate.get(Calendar.YEAR) && actualDate.get(Calendar.MONTH) > dueDate.get(Calendar.MONTH)) {
            int month = actualDate.get(Calendar.MONTH) - dueDate.get(Calendar.MONTH);
            return 500 * month;
        }

        return 0;
    }
}
