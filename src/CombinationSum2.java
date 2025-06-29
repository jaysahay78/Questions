import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
    func(ans, new ArrayList<>(), candidates, 0, target);
        return ans;

}
static void func(List<List<Integer>> ans, List<Integer> list, int[] arr, int ind, int target) {
    if (target == 0) {
        ans.add(new ArrayList<>(list));
        return;
    }

    for (int i = ind; i < arr.length; i++) {
        if (i > ind && arr[i] == arr[i - 1]) continue;
        if (arr[i] > target) break;

        list.add(arr[i]);
        func(ans, list, arr, i + 1, target - arr[i]);
        list.remove(list.size() - 1);
    }
}
}
