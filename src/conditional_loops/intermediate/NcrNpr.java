package conditional_loops.intermediate;

public class NcrNpr extends DistanceBetweenTwoPoints {

    public static void main(String[] args) {
//        ncr();
        npr();
    }


    public static void ncr() {
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter r : ");
        int r = sc.nextInt();

        int result = factorial(n) / (factorial(r) * factorial((n - r)));
        System.out.println("nCr is " + result);
    }

    public static void npr() {
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter r : ");
        int r = sc.nextInt();

        int result = factorial(n) / factorial((n - r));
        System.out.println("nPr is " + result);
    }

    public static int factorial(int input) {
        int f = 1;
        while (input != 1) {
            f = f * input;
            input--;
        }
        return f;
    }

}
