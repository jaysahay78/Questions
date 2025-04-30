import java.util.Arrays;

public class MissingAndRepeating {
    static int[] findMissingAndRepeating(int[] arr) {
        int[] ans ={0,0};
        int xor1ton = 0, xorarr = 0;
        for (int i = 1; i <= arr.length; i++) {
            xor1ton^=i;
        }
        for(int val : arr){
            xorarr^=val;
        }
        int xor = xor1ton^xorarr;

        //right most set bit
        int rightSetBit = xor & ~(xor-1);
        int bucket1=0,bucket2=0;

        for(int i=1; i<=arr.length; i++){
            if((i & rightSetBit) != 0) bucket1^=i;
            else bucket2^=i;
        }
        for(int var : arr){
            if((var & rightSetBit) != 0) bucket1^=var;
            else bucket2^=var;
        }

        int count=0;
        for(int val : arr){
            if (val == bucket1) count++;
        }
        if (count==2){
            ans[0] = bucket1;
            ans[1] = bucket2;
        }
        else {
            ans[0] = bucket2;
            ans[1] = bucket1;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMissingAndRepeating(new int[]{1,2,3,4,6,6})));
    }
}
