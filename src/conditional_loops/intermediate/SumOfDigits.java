package conditional_loops.intermediate;

public class SumOfDigits extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        sumOfDigits();
    }

    public static void sumOfDigits() {

        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);

    }

}
