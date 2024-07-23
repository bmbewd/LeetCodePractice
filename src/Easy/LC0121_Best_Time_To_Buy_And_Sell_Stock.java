package Easy;

import java.util.HashMap;
import java.util.Map;

public class LC0121_Best_Time_To_Buy_And_Sell_Stock {
public int maxProfit(int[] prices) {
        if (prices.length == 0) {
			return 0;
		}
		Map<String, Integer> map = new HashMap<>();
		map.put("max", prices[0]);
		map.put("min", prices[0]);
		map.put("thisProfit", 0);
		map.put("maxProfit", 0);
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < map.get("min") && prices[i] < prices[i - 1]) {
				map.put("thisProfit", map.get("max") - map.get("min"));
				if (map.get("thisProfit") > map.get("maxProfit")) {
					map.put("maxProfit", map.get("thisProfit"));
				}
				map.put("max", prices[i]);
				map.put("min", prices[i]);
			}
			if (prices[i] > map.get("max")) {
				map.put("max", prices[i]);
				map.put("thisProfit", map.get("max") - map.get("min"));
				if (map.get("thisProfit") > map.get("maxProfit")) {
					map.put("maxProfit", map.get("thisProfit"));
				}
			}
		}
		return map.get("maxProfit");
    }
}
