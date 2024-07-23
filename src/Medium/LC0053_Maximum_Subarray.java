package Medium;

public class LC0053_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
		int maxSum = nums[0];
		int start = 0;
		while (start < nums.length) {
			for (int i = start; i < nums.length; i++) {
				sum += nums[i];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
			start++;
			sum = 0;
		}
		return maxSum;
    }
}
