public class buyAndSellStocks2 {
    public static int profit(int prices[]) {
        // LeetCode problem 122 =>

        int profit = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                profit += prices[i] -prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {5, 4, 7, 2, 8, 1};
        System.out.println(profit(prices));
    }
}
