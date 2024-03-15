import java.util.Scanner;

public class CheckMonth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the month:");
            String monthInput = sc.nextLine().toLowerCase().trim();
            int m;
            if (monthInput.equals("january") || monthInput.equals("jan.") || monthInput.equals("jan") || monthInput.equals("1")) {
                m = 1;
            } else if (monthInput.equals("february") || monthInput.equals("feb.") || monthInput.equals("feb") || monthInput.equals("2")) {
                m = 2;
            } else if (monthInput.equals("march") || monthInput.equals("mar.") || monthInput.equals("mar") || monthInput.equals("3")) {
                m = 3;
            } else if (monthInput.equals("april") || monthInput.equals("apr.") || monthInput.equals("apr") || monthInput.equals("4")) {
                m = 4;
            } else if (monthInput.equals("may") || monthInput.equals("5")) {
                m = 5;
            } else if (monthInput.equals("june") || monthInput.equals("jun") || monthInput.equals("6")) {
                m = 6;
            } else if (monthInput.equals("july") || monthInput.equals("jul") || monthInput.equals("7")) {
                m = 7;
            } else if (monthInput.equals("august") || monthInput.equals("aug.") || monthInput.equals("aug") || monthInput.equals("8")) {
                m = 8;
            } else if (monthInput.equals("september") || monthInput.equals("sep.") || monthInput.equals("sep") || monthInput.equals("9")) {
                m = 9;
            } else if (monthInput.equals("october") || monthInput.equals("oct.") || monthInput.equals("oct") || monthInput.equals("10")) {
                m = 10;
            } else if (monthInput.equals("november") || monthInput.equals("nov.") || monthInput.equals("nov") || monthInput.equals("11")) {
                m = 11;
            } else if (monthInput.equals("december") || monthInput.equals("dec.") || monthInput.equals("dec") || monthInput.equals("12")) {
                m = 12;
            } else {
                System.out.println("Invalid month input. Try again: ");
                continue;
            }

            System.out.println("Enter the year:");
            int y;
            try {
                y = Integer.parseInt(sc.nextLine().trim());
                if (y < 0) {
                    System.out.println("Year cannot be negative. Try again");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid year input. Please enter a valid year.");
                continue;
            }

            int daysInMonth = getDaysInMonth(m, y);
            if (daysInMonth == -1) {
                System.out.println("Invalid month or year. Please try again.");
            } else {
                System.out.println("Number of days in " + getMonthName(m) + " " + y + ": " + daysInMonth);
                break;
            }
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }
}
