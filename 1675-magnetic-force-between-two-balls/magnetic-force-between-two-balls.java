class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1] - position[0];
        int max = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(func(position, mid, m)){
                low = mid+1;
                max = mid;
            }
            else high = mid-1;
        }
        return max;
    }
    public boolean func(int[] position, int dist, int m){
        int prev = position[0];
        int count = 1;
        for(int i=1; i<position.length; i++){
            if(Math.abs(position[i] - prev) >= dist){
                prev = position[i];
                count++;
            }
        }
        if(count >= m) return true;
        return false;
    }
}