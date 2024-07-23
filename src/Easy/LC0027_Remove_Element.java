package Easy;

public class LC0027_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int length = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[length] = nums[i];
				length++;
			}
		}
		return length;
    }
}
