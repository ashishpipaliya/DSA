package conditional_loops.intermediate;

public class LeapYear extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        leapYear();
    }

    private static void leapYear() {
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
