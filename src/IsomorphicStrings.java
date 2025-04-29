import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i =0; i<s.length(); i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if (map.containsKey(s.charAt(i))) {
                if(map.get(chs) != cht) return false;
            } else {
                if(set.contains(cht)) return false;
                map.put(chs, cht);
                set.add(cht);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }
}
