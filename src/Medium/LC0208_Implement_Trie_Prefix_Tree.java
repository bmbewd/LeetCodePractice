package Medium;

import java.util.HashMap;
import java.util.Map;

public class LC0208_Implement_Trie_Prefix_Tree {
    public Map<String, String> map;
    
    public void Trie() {
        map = new HashMap<>();
    }

    public void insert(String word) {
        map.put(word, word);
    }
    
    public boolean search(String word) {
        if (map.get(word) != null) {
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        boolean result = false;
        for (String str : map.values()) {
            result = str.startsWith(prefix);
            if (result)
                return result;
        }
        return result;
    }
}
