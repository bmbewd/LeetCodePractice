package Easy;

public class LC0009_Palindrome_Number {
    public boolean isPalindrome(int x) {
        int checkNum = 0;
		int oriNum = x;
		while (x > 0) {
			checkNum = checkNum * 10 + x % 10;
			x /= 10;
		}
		if (checkNum == oriNum) {
			return true;
		}else {
			return false;
		}
    }
}
