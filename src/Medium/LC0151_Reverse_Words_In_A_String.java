package Medium;

public class LC0151_Reverse_Words_In_A_String {
    public String reverseWords(String s) {
        String[] split = s.replaceAll(" ",",").split(",");
        s = "";
        for (int i = split.length-1; i >= 0; i--) {
            if (!split[i].equals("")) {
               s = s + split[i] + " "; 
            }
        }
        
        return s.trim();
    }
}
