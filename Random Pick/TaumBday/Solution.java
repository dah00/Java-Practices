package TaumBday;

public class Solution {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long minimalCost = 0;
        long totalWhiteCost = 0;
        long totalBlackCost = 0;

        totalBlackCost = (bc>wc+z) ?  (wc+z)*b : b*bc;
        totalWhiteCost = (wc>bc+z) ? (bc+z)*w : w*wc;

        minimalCost = totalBlackCost + totalWhiteCost;

        return minimalCost;
    }

}
