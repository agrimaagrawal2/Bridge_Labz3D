package Level3;

import java.util.Scanner;

public class MonthlyCalendar {

    // Month names (1..12 -> Jan..Dec). Index 0 unused for convenience.
    private static final String[] MONTH_NAMES = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Base days per month (non-leap year)
    private static final int[] DAYS_IN_MONTH = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Return month name
    static String monthName(int m) {
        return MONTH_NAMES[m];
    }

    // Leap year rule
    static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    // Days in the given month of the given year
    static int daysInMonth(int m, int y) {
        if (m == 2) return isLeapYear(y) ? 29 : 28;
        return DAYS_IN_MONTH[m];
    }

    // Day of week for first day of month using the given algorithm
    // Returns 0=Sun, 1=Mon, ..., 6=Sat
    static int firstDayOfMonth(int m, int y) {
        int d = 1;                                // first day of month
        int y0 = y - (14 - m) / 12;
        int x  = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        // The formula returns 0=Sun..6=Sat already.
        return (d0 + 7) % 7; // (safety for negative mods on some JVMs)
    }

    // Print the calendar
    static void printCalendar(int m, int y) {
        String header = monthName(m) + " " + y;
        System.out.println(header);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int first = firstDayOfMonth(m, y);
        int days  = daysInMonth(m, y);

        // Leading spaces before day 1
        for (int i = 0; i < first; i++) System.out.print("    ".substring(0, 3));

        // Print each day right-justified width 3
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d", day);
            // move to next line after Saturday
            if ((first + day) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year (e.g., 2005): ");
        int year = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
            return;
        }
        printCalendar(month, year);
    }
}
