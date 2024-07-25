package Medium;

import java.util.HashMap;
import java.util.Map;

public class LC0167_Two_Sum_II_Input_Array_Is_Sorted {
public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] ans = new int[2];
		map.put(target - numbers[0], 1);
		for (int i = 1; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				ans[0] = map.get(numbers[i]);
				ans[1] = i + 1;
				return ans;
			} else {
				map.put(target - numbers[i], i + 1);
			}
		}
		return ans;
    }
}
