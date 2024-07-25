package Easy;

/*
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 * 
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 * 
 *  
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: text = "nlaebolko"
 * Output: 1
 * Example 2:
 * 
 * 
 * 
 * Input: text = "loonbalxballpoon"
 * Output: 2
 * Example 3:
 * 
 * Input: text = "leetcode"
 * Output: 0
 *  
 * 
 * Constraints:
 * 
 * 1 <= text.length <= 10^4
 * text consists of lower case English letters only.
 */
public class LC1189_Maximum_Number_Of_Balloons {
    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        int returnMax = 0;
        for (int i = 0; i < text.length() ; i++) {
            if (text.substring(i, i+1).equals("b")) {
                b++;
            } else if (text.substring(i, i+1).equals("a")) {
                a++;
            } else if (text.substring(i, i+1).equals("l")) {
                l++;
            } else if (text.substring(i, i+1).equals("o")) {
                o++;
            } else if (text.substring(i, i+1).equals("n")) {
                n++;
            }
            
        }
        while (b > 0 && a > 0 && (l/2) > 0 && (o/2) > 0 && n > 0) {
            b--;
            a--;
            l = l - 2;
            o = o - 2;
            n--;
            returnMax++;
        }
        return returnMax;
    }
}
