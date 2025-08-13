public class BinarySubarraySum {
    static int numSubarraysWithSum(int[] nums, int goal) {
        int l=0, sum = 0, count = 0, leadingZeros = 0;
        for(int r = 0; r<nums.length; r++) {
            sum+= nums[r];
            while(l < r && (sum > goal || nums[l]==0)){
                if(nums[l] == 0) leadingZeros++;
                else{
                    sum--;
                    leadingZeros = 0;
                }
                l++;
            }
            if(sum == goal) count += 1 + leadingZeros;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        System.out.println(numSubarraysWithSum(arr, 2));
    }
}
