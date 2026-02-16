class Solution {
    public int maximumProduct(int[] nums) {
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

        for(int num : nums){
            if(num > maxA){
                maxC = maxB;
                maxB = maxA;
                maxA = num;
            }
            else if (num > maxB){
                maxC = maxB;
                maxB = num;
            }
            else if(num > maxC){
                maxC = num;
            }

            if(minA > num){
                minB = minA;
                minA = num;
            }
            else if(minB>num){
                minB = num;
            }
        }
        return Math.max(maxA*maxB*maxC, maxA*minA*minB);
    }
}