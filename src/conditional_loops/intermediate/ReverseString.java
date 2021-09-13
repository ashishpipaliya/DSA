package conditional_loops.intermediate;

public class ReverseString extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        reverseString();
    }

    public static void reverseString() {

        System.out.println("Enter String ");
        String data = sc.nextLine();
        String reversed = "";

        int length = data.length();
        for (int i = 1; i <= data.length(); i++) {
            reversed += data.charAt(length - i);
        }
        System.out.println(reversed);
    }

}
