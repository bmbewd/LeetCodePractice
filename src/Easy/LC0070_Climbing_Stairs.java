package Easy;

import java.util.HashMap;
import java.util.Map;

public class LC0070_Climbing_Stairs {
public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		for (int i = 3; i <= n; i++) {
			map.put(i, map.get(i-2) + map.get(i-1));
		}
		return map.get(n);
    }
}
