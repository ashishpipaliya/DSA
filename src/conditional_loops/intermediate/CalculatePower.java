package conditional_loops.intermediate;

public class CalculatePower extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        double number = powerOfX();
        System.out.println(number);
    }


    public static double powerOfX() {
        double result = 1;

        System.out.print("Enter number : ");
        double number = sc.nextDouble();

        System.out.print("Enter power : ");
        int power = sc.nextInt();

        while (power != 1) {
            result *= number * number;
            power--;
        }
//        System.out.println(result);

        // returning result with thought of using this function instead of Math.pow(x, y)
        return result;
    }
}
