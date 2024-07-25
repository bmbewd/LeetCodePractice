package Easy;

public class LC0344_Reverse_String {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (end > start) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }
}
