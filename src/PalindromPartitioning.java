import java.util.ArrayList;
import java.util.List;

public class PalindromPartitioning {
    static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        func(ans, new ArrayList<>(), 0, s);
        return ans;
    }

    static void func(List<List<String>> ans, List<String> list, int ind, String s) {
        if (ind == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = ind; i < s.length(); ++i) {
            if (isPalindrome(s, ind, i)) {
                list.add(s.substring(ind, i + 1));
                func(ans, list, i + 1, s);
                list.remove(list.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
