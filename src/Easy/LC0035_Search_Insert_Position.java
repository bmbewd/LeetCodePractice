package Easy;

public class LC0035_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
			return 0;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return nums.length;
    }
}
