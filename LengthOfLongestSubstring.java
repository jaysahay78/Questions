import java.util.HashSet;

public class LengthOfLongestSubstring {
    static int lengthOfLongestSubstring(String s){
        if (s == null || s.length() == 0){
            return 0;
        }
        HashSet<Character> set =new HashSet<>();
        int l = 0;
        int maxLength = 0;
        for (int r = 0; r < s.length(); r++) {
            char currentChar = s.charAt(r);
            while(set.contains(currentChar)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(currentChar);
            maxLength = Math.max(maxLength, r-l+1);
        }
        return maxLength;
    }
}
