package conditional_loops.intermediate;

public class SumOfNegativeEvenOddNumbers extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        negativeEvenOddSum();
    }

    private static void negativeEvenOddSum() {
        System.out.println("Enter numbers and press 0 to break");
        int negative = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            } else if (n % 2 == 0) {
                even += n;
            } else if (n < 0) {
                negative += n;
            } else {
                odd += n;
            }
        }
        System.out.println("negative = " + negative);
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }
}
