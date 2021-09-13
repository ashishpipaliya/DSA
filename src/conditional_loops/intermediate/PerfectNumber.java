package conditional_loops.intermediate;

public class PerfectNumber extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        perfectNumber();
    }

    public static void perfectNumber() {
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        int sum = 1;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) System.out.println(number + " is perfect number.");
        else System.out.println(number + " is not perfect number.");
    }
}
