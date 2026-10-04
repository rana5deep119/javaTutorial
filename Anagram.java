
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Anagram {

    public List<List<String>> groupAnagram(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for (String s : strs) {

            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if (!mp.containsKey(key)) {
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(s);
        }
        return new ArrayList<>(mp.values());
    }

}
