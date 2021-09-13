package conditional_loops.intermediate;

public class CommissionPercentage extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        commission();
    }


    public static void commission() {
        System.out.println("Enter amount : ");
        double amount = sc.nextDouble();

        System.out.println("Enter commission percentage : ");
        double p = sc.nextDouble();

        double commission = (amount * p) / 100;
        System.out.println(commission);

    }
}
