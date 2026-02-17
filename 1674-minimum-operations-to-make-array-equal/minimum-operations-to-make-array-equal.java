class Solution {
    public int minOperations(int n) {
        int mid = n/2;
        int ans = 0;
        for(int i=mid-1; i>=0; i--){
            if(n%2 == 0){
                ans += 2*mid - (2*i+1);
            }
            else if(n%2!= 0){
                ans+= (2*mid+1) - (2*i+1);
            }
        }
        return ans;
    }
}