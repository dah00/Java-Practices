public class Main {

    /*
        Input: prices = [7,1,5,3,6,4]
        Output: 7
        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
     */

    /*
        Input: prices = [1,2,3,4,5]
        Output: 4
        Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
        Note that you cannot buy on day 1, buy on day 2 and sell them later,
        as you are engaging multiple transactions at the same time. You must sell before buying again.
     */

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        // First try
/*        int profit = 0, i=0;
        while(i<prices.length-1){
            if(prices[i] > prices[i+1])
                i++;
            else{
                int j = i+1;
                while(j<prices.length-1 && prices[j] < prices[j+1]){
                    j++;
                }
                profit += prices[j] - prices[i];
                i = j+1;
            }
        }
        return profit;*/

        // Better performance
        int profit = 0;

        for (int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1])
                profit += prices[i] - prices[i-1];
        }
        return profit;
    }
}
