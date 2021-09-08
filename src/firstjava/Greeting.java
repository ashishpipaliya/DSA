package firstjava;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, "+sc.nextLine());
    }
}
