package conditional_loops.basics;
import java.util.Scanner;

public class InputNumbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        sum();
//        largestNumber();
        subtractProductAndSum(4421);
    }

    public static void sum() {
        int sum = 0;
        System.out.println("Enter numbers and press 0 (ZERO) at last to stop input");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                sum += num;
            }
        }
        System.out.println("Sum is : " + sum);
    }


    public static void largestNumber() {
        int largest = 0;
        System.out.println("Enter numbers and press 0 (ZERO) at last to stop input");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                if (num > largest) largest = num;
            }
        }
        System.out.println("Largest number is : " + largest);
    }

    public static void subtractProductAndSum(int n) {
        int product =1, sum =0;

        while(n >0){
            int last = n%10;
            product *= last;
            sum += last;
            n= n/10;
        }
        int result =product - sum;
        System.out.println(result);
    }
}
