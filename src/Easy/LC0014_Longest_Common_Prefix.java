package Easy;

public class LC0014_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
		if (strs.length > 0) {
			int index = 0;
			int length = strs[0].length();
			for (int i = 1; i < strs.length; i++) {
				if (strs[i].length() < length) {
					length = strs[i].length();
					index = i;
				}
			}
			for (int i = 0; i < strs[index].length(); i++) {
				char prefix = strs[index].charAt(i);
				int count = 0;
				for (String thisStr : strs) {
					if (prefix == thisStr.toCharArray()[i]) {
						count++;
					}
				}
				if (count == strs.length) {
					ans += prefix;
				} else {
					break;
				}
			}
		}
		return ans;
    }
}
