package Hard;
/*
 * Start from integer 1, remove any integer that contains 9 such as 9, 19, 29...

 * Now, you will have a new integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 10, 11, ...].

 * Given an integer n, return the nth (1-indexed) integer in the new sequence.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 9
 * Output: 10
 * Example 2:
 * 
 * Input: n = 10
 * Output: 11
 *  
 * 
 * Constraints:
 * 
 * 1 <= n <= 8 * 108
 */
public class LC0660_Remove_9 {
    class Solution {
        public int newInteger(int n) {
            String str = "";
            while (n > 0){
                int r;
                r = n % 9;
                str = String.valueOf(r) + str;
                n = n / 9;
            }            
            return Integer.parseInt(str);
            // 將n轉換成9進制
            //return Integer.parseInt(Integer.toString(n,9));
        }
    }
}
