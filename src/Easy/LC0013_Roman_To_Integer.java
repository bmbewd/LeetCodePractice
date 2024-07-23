package Easy;

import java.util.HashMap;

public class LC0013_Roman_To_Integer {
public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		map.put("IV", -2);
		map.put("IX", -2);
		map.put("XL", -20);
		map.put("XC", -20);
		map.put("CD", -200);
		map.put("CM", -200);
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.substring(i,i+1))) {
				ans += map.get(s.substring(i,i+1));
			}
			if (i <= s.length()-2 && map.containsKey(s.substring(i,i+2))) {
				ans += map.get(s.substring(i,i+2));
			}
		}
		return ans;
    }
}
