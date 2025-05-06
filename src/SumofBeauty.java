import java.util.HashMap;
import java.util.Map;

public class SumofBeauty {
    static int beautySum(String s){
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            Map<Character, Integer> map = new HashMap<>();
            for (int j=i; j<s.length(); j++){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
                int maxValue = 0;
                int minValue = Integer.MAX_VALUE;
                maxValue = map.get(s.charAt(j));
                for(Map.Entry<Character, Integer> entry: map.entrySet()){
                    maxValue = Math.max(maxValue, entry.getValue());
                    minValue = Math.min(minValue, entry.getValue());
                }
                ans+=maxValue-minValue;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
