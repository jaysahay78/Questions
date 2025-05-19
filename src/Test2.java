import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {7,7,7,9};
        HashMap map = new HashMap();
        for(int i=0; i<arr.length;i++){
            map.put(arr[i], i);
        }
        System.out.println(map.get(7));
    }
}
