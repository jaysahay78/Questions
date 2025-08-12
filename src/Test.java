import java.util.*;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        System.out.println(dq.peekFirst());
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        String s = "hello";
    }
}
