package Easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LC0136_Single_Number {
public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], nums[i]);
            }
            
        }
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> it = keySet.iterator();
        return map.get(it.next());
    }
}
