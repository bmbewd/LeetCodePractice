package Easy;

public class LC0088_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				nums1[i] = nums2[i];
			}
		}
		if (n != 0) {
			for (int i = 0; i < n; i++) {
				for (int j = i; j < m; j++) {
					if (m == nums1.length)
						break;
					if (nums2[i] < nums1[j]) {
						for (int k = nums1.length - 1; k > j; k--) {
							nums1[k] = nums1[k-1];
						}
						nums1[j] = nums2[i];
						break;
					} else {
						nums1[m] = nums2[i];
					}
				}
				m++;
			}
		}
    }
}
