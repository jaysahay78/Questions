import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    static List<String> generateParentheses(String s) {
        List<String> result = new ArrayList<>();
        generate(result, 0,0,"", n);
        return result;
        int[] arr = {1,2,3,4,5};
        int a = arr.length;
    }
    static void generate(List<String> list, int open, int close, String unpr, int n){
        if(unpr.length() == 2*n){
            list.add(unpr);
            return;
        }
        if(open < n){
            generate(list, open+1, close, unpr+'(', n);
        }
        if(close < open){
            generate(list, open, close+1, unpr+')', n);
        }
    }

    public static void main(String[] args) {

    }
}
