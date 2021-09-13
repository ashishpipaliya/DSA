package conditional_loops.intermediate;

public class CompoundInterest extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        compoundInterest();
    }

    public static void compoundInterest() {
        System.out.print("Enter principal amount : ");
        double P = sc.nextDouble();

        System.out.print("Enter interest rate : ");
        double r = sc.nextDouble();

        System.out.print("Enter time in year: ");
        int t = sc.nextInt();

        double result = P * Math.pow((1 + (r / 100)), t);
        System.out.println(result);
    }
}
