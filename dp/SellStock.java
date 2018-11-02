package dp;

public class SellStock {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                profit = prices[j] - prices[i] > profit ? prices[j] - prices[i] : profit;
            }
        }
        return profit;
    }

    public static int solution(int[] prices) {
        int min_price = Integer.MAX_VALUE;;
        int max_profit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min_price) {
                min_price = prices[i];
            } else if(prices[i] - min_price > max_profit){
                max_profit = prices[i] - min_price;
            }
        }
        return max_profit;
    }

    public static void main(String args[]) {
        int[] arr = {7,6,4,2,1,8};
        System.out.println(maxProfit(arr));
        System.out.println(solution(arr));
    }
}
