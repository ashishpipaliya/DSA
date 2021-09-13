package conditional_loops.intermediate;

public class HCFandLCM extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
//        hfc();
        lcm();
    }


    // HFC
    public static void hfc() {
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("GCD of HDC of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
    }


    public static void lcm() {
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int lcm = (num1 * num2) / gcd(num1, num2);
        System.out.println("LCM is " + lcm);

    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

}
