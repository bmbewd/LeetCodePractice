package Easy;

public class LC0069_SqrtX {
    public int mySqrt(int x) {
        int count = 0;
		for (int i = 1; i < Integer.MAX_VALUE / 2; i += 2) {
			x -= i;
			if (x < 0) {
				return count;
			} else if (x == 0) {
				return count + 1;
			}
			count++;
		}
		return 0;
    }
}
