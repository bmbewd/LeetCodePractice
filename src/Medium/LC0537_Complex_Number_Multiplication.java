package Medium;

/*
 * A complex number can be represented as a string on the form "real+imaginaryi" where:
 * 
 * real is the real part and is an integer in the range [-100, 100].
 * imaginary is the imaginary part and is an integer in the range [-100, 100].
 * i2 == -1.
 * Given two complex numbers num1 and num2 as strings, return a string of the complex number that represents their multiplications.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: num1 = "1+1i", num2 = "1+1i"
 * Output: "0+2i"
 * Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
 * Example 2:
 * 
 * Input: num1 = "1+-1i", num2 = "1+-1i"
 * Output: "0+-2i"
 * Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 *  
 * 
 * Constraints:
 * 
 * num1 and num2 are valid complex numbers.
 */
public class LC0537_Complex_Number_Multiplication {
    public String complexNumberMultiply(String num1, String num2) {
        //         System.out.println(num1);
        //         System.out.println(num1.char);
        
        //         return num1;
        int i = (Integer.parseInt(num1.split("\\+")[0]) * Integer.parseInt(num2.split("\\+")[0])) - (Integer.parseInt(num1.split("\\+")[1].split("i")[0]) * Integer.parseInt(num2.split("\\+")[1].split("i")[0]));
        int j = Integer.parseInt(num1.split("\\+")[0]) * Integer.parseInt(num2.split("\\+")[1].split("i")[0]) + Integer.parseInt(num2.split("\\+")[0]) * Integer.parseInt(num1.split("\\+")[1].split("i")[0]);
        return i+ "+" + j + "i";
    }
}
