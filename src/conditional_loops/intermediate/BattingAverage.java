package conditional_loops.intermediate;

public class BattingAverage extends DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        battingAverage();
    }

    public static void battingAverage() {
        System.out.print("Enter run scored : ");
        int s = sc.nextInt();

        System.out.print("Enter number of outs : ");
        double o = sc.nextInt();

        double result = s / o;
        System.out.println("Batting Average : " + result);
    }
}
