package Easy;

import java.util.HashMap;
import java.util.Map;

public class LC0217_Contains_Duplicate {
public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return true;
            }
            map.put(nums[i], nums[i]);
        }
        return false;
    }
}
