package Easy;

public class LC0066_Plus_One {
    public int[] plusOne(int[] digits) {
        int[] newDigits = new int[digits.length + 1];
		for (int i = digits.length - 1; i >= 0; i--) {
			newDigits[i + 1] = digits[i];
			if (digits[i] < 9) {
				digits[i] = digits[i] + 1;
				newDigits[i + 1] = digits[i];
				return digits;
			} else {
				digits[i] = 0;
				newDigits[i + 1] = 0;
				if (i == 0) {
					newDigits[i] = 1;
					return newDigits;
				}
			}
		}
		return newDigits;
    }
}
