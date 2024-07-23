package Easy;

public class LC0028_Find_The_Index_Of_The_First_Occurrence_In_A_String {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
			return 0;
		}
		for (int i = 0; i < haystack.length(); i++) {
			if (i + needle.length() <= haystack.length()) {
				if (haystack.substring(i, i + needle.length()).equals(needle)) {
					return i;
				}
			}
		}
		return -1;
    }
}
