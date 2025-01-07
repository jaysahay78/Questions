package com.company;
import java.util.*;

public class subarraysWithXork {
    static int subarraysWithXorK(int[] A, int B){
        int n = A.length;
        int xr = 0;
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i< A.length; i++){
            xr = xr^A[i];

            int x = xr^B;

            if (map.containsKey(x)){
                cnt+=map.get(x);
            }

            if (map.containsKey(xr)){
                map.put(xr,map.get(xr)+1);
            }
            else map.put(xr,1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        System.out.println(subarraysWithXorK(arr,6));
    }
}