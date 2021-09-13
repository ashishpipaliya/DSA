package conditional_loops.intermediate;

public class ArmstrongNumber extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        armstrong();
    }

    public static void armstrong() {

        System.out.println("Enter number : ");
        Integer num = sc.nextInt();
        int sum = 0;
        int length = num.toString().length();
        int temp = num;
        while (num > 0) {
            int a = num % 10;
            sum += Math.pow(a, length);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Not Armstrong because " + sum + " is not same as " + temp);
        }
    }

}
