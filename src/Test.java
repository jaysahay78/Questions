import java.util.*;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1};
        int l = -2, r=0, count = 0;
        while(l<arr.length && r<arr.length){
            if(arr[r] == 1) count++;
            l++;
            r++;
        }
        System.out.println(count);
    }
}
