package Easy;

public class LC0125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        char[] ss = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
		for (int i = 0; i < ss.length / 2; i++) {
			if (ss[i] != ss[ss.length - 1 - i]) {
				return false;
			}
		}
		return true;
    }
}
