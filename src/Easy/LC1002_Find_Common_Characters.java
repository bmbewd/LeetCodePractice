package Easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: words = ["bella","label","roller"]
 * Output: ["e","l","l"]
 * Example 2:
 * 
 * Input: words = ["cool","lock","cook"]
 * Output: ["c","o"]
 *  
 * 
 * Constraints:
 * 
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 100
 * words[i] consists of lowercase English letters.
 */
public class LC1002_Find_Common_Characters {
public List<String> commonChars(String[] A) {
        List<String> chList = new ArrayList<>();
		int index = 0;
		int length = A[0].length();
		for (int i = 1; i < A.length; i++) {
			if (A[i].length() < length) {
				length = A[i].length();
				index = i;
			}
		}
		char[] shortestCharArr = A[index].toCharArray();/* 從長度最短的字串當基準開始查 */
		for (char ch : shortestCharArr) {
			boolean isFound = false;/* 這個字元有沒有在這個字串被找到 */
			for (int i = 0; i < A.length; i++) {
				int thiscount = 0;
				char[] thisStrArr = A[i].toCharArray();
				for (char ch1 : thisStrArr) {
					if (ch == ch1) {
						thiscount++;
						isFound = true;
					}
				}
				if (thiscount == 0) {
					isFound = false;
					break;
				} else {
					List<String> chList1 = chList;
					int checkCount = 0;
					for (String str : chList1) {
						if (str.equals(String.valueOf(ch))) {
							checkCount++;
						}
					}
					if (thiscount > checkCount) {
						isFound = true;
					}else {
						isFound = false;
						break;
					}
				}
			}
			if (isFound) {
				chList.add(String.valueOf(ch));
			}
		}
		return chList;
    }
}
