package Medium;

public class LC0153_Find_Minimum_In_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        if (nums[0] < nums[nums.length-1] && nums[0] <  nums[1]) {
            return nums[0];
        }
        int min = nums[1];
        for (int i = 1; i < nums.length-1; i++) {
            if (min < nums[i-1] && min < nums[i+1]) {
                return nums[i];
            } else if(min > nums[i-1]) {
                min = nums[i+1];
            }
        }
        return min;
    }
}
