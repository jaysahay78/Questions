import java.util.Arrays;
import java.util.HashMap;

public class findInterval {
    public static int[] findRightInterval(int[][] intervals) {
        if(intervals.length == 1) return new int[]{-1};
        int n = intervals.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(intervals[i][0], i);
        }
        int[] sorted = new int[n];
        for(int[] interval : intervals){
            Arrays.fill(sorted, interval[0]);
        }
        Arrays.sort(sorted);
        int a = -1;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int l = 0;
            int r = n-1;
            while(l<r){
                int mid = l + (r-l)/2;
                if(sorted[mid] >= intervals[i][1]){
                    r = mid;
                }
                else {
                    l = mid+1;
                }
            }
            if(sorted[l] >= intervals[i][1]) ans[++a] = map.get(sorted[l]);
            else ans[++a] = -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] intervals = {{3,4}, { 2, 3}, {1,2}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
}
