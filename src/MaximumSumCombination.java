import java.util.*;

public class MaximumSumCombination {
    public static void main(String[] args) {

    }
    public List<Integer> maxSumCombo(int[] nums1, int[] nums2, int k){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        HashSet<String> set = new HashSet<>();
        int n = nums1.length;
        pq.offer(new int[] {nums1[n-1] + nums2[n-1], n-1, n-1});
        set.add((n-1) + " " + (n-1));
        List<Integer> result = new ArrayList<>();
        while(k-- >0 && !pq.isEmpty()){
            int[] curr = pq.poll();
            int sum = curr[0], i = curr[1], j = curr[2];
            result.add(sum);
            if(i-1 >= 0 && !set.contains((i-1) + " " + (j)){
                pq.offer(new int[]{nums1[i-1] + nums2[j], i-1, j});
                set.add((i-1) + " " + (j));
            }

            if(j-1 >= 0 && !set.contains((i) + " " + (j-1)){
                pq.offer(new int[]{nums1[i] + nums2[j-1], i, j-1});
                set.add((i) + " " + (j-1));
            }
        }
        return result;
    }
}
