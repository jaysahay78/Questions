class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        long ops = 0;
        long sum = 0;
        if (k == 0) {
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] != nums2[i]) return -1;
            }
            return 0;
        }
        for(int i=0; i<nums1.length; i++){
            if((nums1[i] - nums2[i]) % k != 0)return -1;
            if(nums1[i] - nums2[i] > 0){
                ops+=(nums1[i]-nums2[i])/k;
            }
            sum+=nums1[i]-nums2[i];
        }
        if(sum != 0) return -1;
        return ops;
    }
}