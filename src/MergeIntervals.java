import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            if (a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
                else {
                    ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), intervals[i][1]));
                }
        }
        int[][] res = ans.stream()
                .map(l -> l.stream().mapToInt(i -> i).toArray())
                .toArray(int[][]::new);
        return res;
}

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,9}, {9,11}, {8,10}, {2,4}, {15,18}, {16, 17}};
        int[][] res = MergeIntervals.merge(intervals);
        System.out.println(Arrays.deepToString(res));
    }
}