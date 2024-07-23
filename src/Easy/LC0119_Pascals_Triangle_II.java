package Easy;

import java.util.LinkedList;
import java.util.List;

public class LC0119_Pascals_Triangle_II {
public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new LinkedList<>();
		List<Integer> tempList = null;
		while (ans.size() <= rowIndex) {
			tempList = new LinkedList<>();
			if (ans.size() == 0) {
				tempList.add(1);
			} else if (ans.size() == 1) {
				tempList.add(1);
				tempList.add(1);
			} else {
				for (int i = 0; i <= ans.size(); i++) {
					if (i == 0 || i == ans.size()) {
						tempList.add(1);
					} else {
						tempList.add(ans.get(ans.size()-1).get(i) + ans.get(ans.size()-1).get(i - 1));
					}
				}
			}
			ans.add(tempList);
		}
		return ans.get(rowIndex);
    }
}
