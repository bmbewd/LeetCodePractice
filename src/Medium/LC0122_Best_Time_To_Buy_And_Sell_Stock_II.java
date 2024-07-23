package Medium;

public class LC0122_Best_Time_To_Buy_And_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
			return 0;
		}
		int min = prices[0];
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < prices[i - 1]) {
				maxProfit = maxProfit + prices[i - 1] - min;
				min = prices[i];
			}
		}
		maxProfit = maxProfit + prices[prices.length - 1] - min;
		return maxProfit;
    }
}
