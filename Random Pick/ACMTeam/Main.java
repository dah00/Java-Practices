package ACMTeam;

public class Main {
    public static void main(String[] args) {
        //String[] topics = {"10101", "11110", "00010"};
        String[] topics = {"10101", "11110", "00010"};
        int[] result = Solution.acmTeam(topics);
        System.out.println(result[0] + " , " + result[1]);
    }
}
