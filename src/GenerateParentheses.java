import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    static List<String> generateParentheses(String s) {
        List<String> result = new ArrayList<>();
        generatePar(result, 0,0,"", s.length());
        return result;
    }
    static void generatePar(List<String> list, int open, int close, String unpr, int n){
        if(unpr.length() == 2*n){
            list.add(unpr);
            return;
        }
        if(open < n){
            generatePar(list, open+1, close, unpr+'(', n);
        }
        if(close < open){
            generatePar(list, open, close+1, unpr+')', n);
        }
    }

    public static void main(String[] args) {

    }
}
