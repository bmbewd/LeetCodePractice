package Medium;

public class LC0038_Count_And_Say {
    public String countAndSay(int n) {
        String str = "1"; /*第一次字串*/
		String lastStr = str; /*最後一次字串*/
		int count = 1; /*計數 n*/
		int lastStrCount = 0;
		int countNum = 0; /*該數字的次數*/
		while (count < n) {
			String newStr = "";
			
			String strNum = lastStr.split("")[0]; /*最後一次字串的第一個字元*/
			
			for (String thisStr : lastStr.split("")) {
				lastStrCount++;
				if (strNum.equals(thisStr)) {
					countNum++;
				}
				if (!strNum.equals(thisStr)) {
					newStr = newStr + countNum + strNum;
					strNum = thisStr;
					countNum = 1;
				}
				if (lastStrCount == lastStr.length()) {
					newStr = newStr + countNum + strNum;
					lastStrCount = 0;
					countNum = 0;
				}
			}
			count++;
			lastStr = newStr;
		}
		return lastStr;
    }
}
