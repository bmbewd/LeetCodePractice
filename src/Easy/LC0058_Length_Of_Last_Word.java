package Easy;

public class LC0058_Length_Of_Last_Word {
    public int lengthOfLastWord(String s) {
        if (s.split(" ").length != 0) {
			return s.split(" ")[s.split(" ").length-1].length();
		}
		return 0;
    }
}
