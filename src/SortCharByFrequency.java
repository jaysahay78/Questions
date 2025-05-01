import java.util.*;

public class SortCharByFrequency {
    static String frequencySort(String s) {
        StringBuilder ans= new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        maxHeap.addAll(map.entrySet());

        while (!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            ans.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}
