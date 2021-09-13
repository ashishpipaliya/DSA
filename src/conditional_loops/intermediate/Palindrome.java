package conditional_loops.intermediate;

public class Palindrome extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        palindrome();
    }


    public static void palindrome() {
        System.out.print("Enter number :");
        int num = sc.nextInt();
        String temp = "";

        int original = num;
        while (num > 0) {
            temp += num % 10;
            num = num / 10;
        }
        if (Integer.parseInt(temp) == original) {
            System.out.println(original + " is Palindrome number");
        } else {
            System.out.println(original + " Not Palindrome number");
        }


    }
}
