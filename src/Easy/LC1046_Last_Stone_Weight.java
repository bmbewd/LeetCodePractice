package Easy;

import java.util.ArrayList;
import java.util.List;

/*
 * You are given an array of integers stones where stones[i] is the weight of the ith stone.
 * 
 * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
 * 
 * If x == y, both stones are destroyed, and
 * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 * At the end of the game, there is at most one stone left.
 * 
 * Return the weight of the last remaining stone. If there are no stones left, return 0.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: stones = [2,7,4,1,8,1]
 * Output: 1
 * Explanation: 
 * We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
 * we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
 * we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
 * we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.
 * Example 2:
 * 
 * Input: stones = [1]
 * Output: 1
 *  
 * 
 * Constraints:
 * 
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 1000
 */
public class LC1046_Last_Stone_Weight {
    public int lastStoneWeight(int[] stones) {
        List<Integer> swList = new ArrayList<>();
		for (int is : stones) {
			swList.add(is);
		}
		Integer big = 0;
		Integer small = 0;
		while (swList.size() > 1) {
			int biggestIndex = 0;
			int sexondBigIndex = 0;
			if (swList.get(0) < swList.get(1)) {
				biggestIndex = 1;
				sexondBigIndex = 0;
				big = swList.get(1);
				small = swList.get(0);
			} else {
				biggestIndex = 0;
				sexondBigIndex = 1;
				big = swList.get(0);
				small = swList.get(1);
			}

			if (swList.size() > 2) {
				for (int i = 2; i < swList.size(); i++) {
					if (swList.get(i) >= big) {
						small = big;
						big = swList.get(i);
						sexondBigIndex = biggestIndex;
						biggestIndex = i;
					}
					if (swList.get(i) >= small && swList.get(i) < big) {
						small = swList.get(i);
						sexondBigIndex = i;
					}
				}
			}
			if(biggestIndex > sexondBigIndex) {
				swList.remove(biggestIndex);
				swList.remove(sexondBigIndex);
			}else {
				swList.remove(sexondBigIndex);
				swList.remove(biggestIndex);
			}
			swList.add(big - small);
			big = 0;
			small = 0;
		}
        return swList.get(0);
    }
}
