package Easy;

import java.util.ArrayList;
import java.util.List;

public class LC0448_Find_All_Numbers_Disappeared_In_An_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            res[nums[i] - 1] = nums[i];

        // Look for 0s and add to the result
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) 
            if (res[i] == 0) 
                result.add(i + 1);

        return result;
    }
}
