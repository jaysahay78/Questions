import java.util.ArrayList;
import java.util.List;

public class BinaryString {
    static List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list = (func(list, n));
        return list;
    }
    static List<String> func(List<String> list, int n){
        List<String> ans = new ArrayList<>();
        if(n == 1) return list;
        for(String s : list){
            if(s.charAt(s.length()-1) == '0'){
                ans.add(s+'1');
            }
            else if (s.charAt(s.length() - 1) == '1'){
                ans.add(s+'0');
                ans.add(s+'1');
            }
        }
        return func(ans, n-1);
    }

    public static void main(String[] args) {
        List<String> list = validStrings(3);
        System.out.println(list);
    }
}
