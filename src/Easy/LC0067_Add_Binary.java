package Easy;

public class LC0067_Add_Binary {
    public String addBinary(String a, String b) {
        String[] aArray = a.split("");
		String[] bArray = b.split("");
		String ans = "";
		int lengthSub = 0;
		boolean carry = true;
		if (aArray.length >= bArray.length) {
			lengthSub = aArray.length - bArray.length;
			for (int i = aArray.length - 1; i >= 0; i--) {
				if (i == aArray.length - 1) {
					carry = false;
				}
				if (aArray[i].equals("0")) {
					if (i - lengthSub >= 0 && bArray[i - lengthSub].equals("0")) {
						if (!carry) {
							ans = "0" + ans;
						} else if (carry) {
							ans = "1" + ans;
							carry = false;
						}
					}
					if (i - lengthSub >= 0 && bArray[i - lengthSub].equals("1")) {
						if (!carry) {
							ans = "1" + ans;
							carry = false;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
					if (i - lengthSub < 0) {
						if (!carry) {
							ans = "0" + ans;
						} else if (carry) {
							ans = "1" + ans;
							carry = false;
						}
					}
				}
				if (aArray[i].equals("1")) {
					if (i - lengthSub >= 0 && bArray[i - lengthSub].equals("0")) {
						if (!carry) {
							ans = "1" + ans;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
					if (i - lengthSub >= 0 && bArray[i - lengthSub].equals("1")) {
						if (!carry) {
							ans = "0" + ans;
							carry = true;
						} else if (carry) {
							ans = "1" + ans;
							carry = true;
						}
					}
					if (i - lengthSub < 0) {
						if (!carry) {
							ans = "1" + ans;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
				}
				if (i == 0 && carry) {
					ans = "1" + ans;
				}
			}
		} else if (aArray.length < bArray.length){
			lengthSub = bArray.length - aArray.length;
			for (int i = bArray.length - 1; i >= 0; i--) {
				if (i == bArray.length - 1) {
					carry = false;
				}
				if (bArray[i].equals("0")) {
					if (i - lengthSub >= 0 && aArray[i - lengthSub].equals("0")) {
						if (!carry) {
							ans = "0" + ans;
						} else if (carry) {
							ans = "1" + ans;
							carry = false;
						}
					}
					if (i - lengthSub >= 0 && aArray[i - lengthSub].equals("1")) {
						if (!carry) {
							ans = "1" + ans;
							carry = false;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
					if (i - lengthSub < 0) {
						if (!carry) {
							ans = "0" + ans;
						} else if (carry) {
							ans = "1" + ans;
							carry = false;
						}
					}
				}
				if (bArray[i].equals("1")) {
					if (i - lengthSub >= 0 && aArray[i - lengthSub].equals("0")) {
						if (!carry) {
							ans = "1" + ans;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
					if (i - lengthSub >= 0 && aArray[i - lengthSub].equals("1")) {
						if (!carry) {
							ans = "0" + ans;
							carry = true;
						} else if (carry) {
							ans = "1" + ans;
							carry = true;
						}
					}
					if (i - lengthSub < 0) {
						if (!carry) {
							ans = "1" + ans;
						} else if (carry) {
							ans = "0" + ans;
							carry = true;
						}
					}
				}
				if (i == 0 && carry) {
					ans = "1" + ans;
				}
			}
		}
		return ans;
    }
}
