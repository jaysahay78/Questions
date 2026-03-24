class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        int ans = 0;
        for(int i=len-1; i>=0; i--){
            if(len - i <= citations[i]) ans++;
            else return ans;
        }
        return ans;
    }
}