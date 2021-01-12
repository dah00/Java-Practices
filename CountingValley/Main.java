package CountingValley;

public class Main {
    public static void main(String[] args) {
        String path = "UDDDUDUU";
        int steps = path.length();
        System.out.println(Counting.countingValleys(steps, path));
    }
}
