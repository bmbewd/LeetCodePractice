package Easy;

import java.util.ArrayList;

/*
 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
 * 
 * Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
 * 
 * Return any answer array that satisfies this condition.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 * Example 2:
 * 
 * Input: nums = [2,3]
 * Output: [2,3]
 *  
 * 
 * Constraints:
 * 
 * 2 <= nums.length <= 2 * 10^4
 * nums.length is even.
 * Half of the integers in nums are even.
 * 0 <= nums[i] <= 1000
 */
public class LC0922_Sort_Array_By_Parity_II {
public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        int[] results = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenList.add(nums[i]);
            } else {
                oddList.add(nums[i]);
            }
        }
        for (int i = 0; i < evenList.size(); i++) {
            results[(i*2)] = evenList.get(i);
            results[(i*2)+1] = oddList.get(i);
        }
        return results;
    }
}
