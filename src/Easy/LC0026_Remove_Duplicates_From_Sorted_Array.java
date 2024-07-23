package Easy;

public class LC0026_Remove_Duplicates_From_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int length = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i-1] < nums[i]) {
                nums[length] = nums[i];
                length++;
			}
		}
		return length;
    }
}
