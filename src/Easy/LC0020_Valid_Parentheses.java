package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC0020_Valid_Parentheses {
public boolean isValid(String s) {
        if(s.equals("")) {
			return true;
		}
		HashMap<String, Integer> map = new HashMap<>();
		map.put("(", 1);
		map.put(")", -1);
		map.put("[", 2);
		map.put("]", -2);
		map.put("{", 3);
		map.put("}", -3);
		List<String> sList = new ArrayList<>();
		int index = 0;
		for (String str: s.split("")) {
			sList.add(str);
			if (map.get(sList.get(index)) < 0 && sList.size() > 1) {
				if (map.get(sList.get(index)) + map.get(sList.get(index - 1)) != 0) {
					return false;
				} else {
					sList.remove(index);
					sList.remove(index - 1);
					index-= 2;
				}
			}
			index++;
		}
		if (sList.size() == 0) {
			return true;
		} else {
			return false;
		}
    }
}
