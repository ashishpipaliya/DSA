package conditional_loops.intermediate;

public class DepreciationOfValue extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        depreciation();
    }

    public static void depreciation() {
        System.out.print("Enter initial value : ");
        double v1 = sc.nextDouble();

        System.out.print("Enter depreciation rate : ");
        double r = sc.nextDouble();

        System.out.print("Enter time : ");
        int t = sc.nextInt();

        double result = v1 * Math.pow((1 - (r / 100)), t);
        System.out.println(result);
    }
}
