package Medium;

public class LC0011_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int thisArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int l = right - left;
            thisArea = h * l;
            maxArea = Math.max(maxArea, thisArea);
            if (h == height[left]) {
                left++;
            } else {
                right--;
            }
        } 
        return maxArea;

    }
}
