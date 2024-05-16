import java.util.*;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        return (helper("", digits));
    }

    static List<String> helper(String pr, String upr){
        if (upr.isEmpty()){
            List<String> ans = new ArrayList<>();
            ans.add(pr);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = upr.charAt(0) - '0';
        int start = (digit <= 7) ? (digit - 2) * 3 : (digit - 2) * 3 + 1;
        int end = start + ((digit == 7 || digit == 9) ? 4 : 3);
        for (int i = start; i < end; i++) {
            char ch = (char)('a' + i );
            list.addAll(helper(pr + ch, upr.substring(1)));
        }
        return list;
    }
}
