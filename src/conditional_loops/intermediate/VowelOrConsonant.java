package conditional_loops.intermediate;

public class VowelOrConsonant extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        determineVowelOrConsonant();
    }

    public static void determineVowelOrConsonant() {
        System.out.print("Enter single alphabet : ");
        char ch = sc.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is Vowel");
        } else {
            System.out.println(ch + " is Consonant");
        }
    }
}
