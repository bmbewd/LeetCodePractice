package Medium;

public class LC0007_Reverse_Integer {

    public int reverse(int x) {
        String string = "";
        int num = x;
        if (x < 0) {
            num = num * -1;
        }
        while(num > 0) {
            string = string + num % 10 ;
            num /= 10;
        }
        try {
            num = Integer.parseInt(string);
            if (x < 0){
                num = num * -1;
            }
             return num;
        } catch (Exception e) {
            return 0;
        }
    }

}
