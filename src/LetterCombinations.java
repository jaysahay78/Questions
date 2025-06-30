import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    static List<String> letterCombinations(String digits) {
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0) return ans;
        func(ans, arr, digits.length(), digits, new StringBuilder());
        return ans;
    }

    static void func(List<String> ans, String[] arr, int ind, String digits, StringBuilder sb){
        if(ind == 0){
            ans.add(sb.toString());
            return;
        }

        String s = arr[digits.charAt(0) - '0'];
        for(int  i = 0; i< s.length(); i++){
            sb.append(s.charAt(i));
            func(ans, arr, ind-1, digits.substring(1), sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {

    }
}
