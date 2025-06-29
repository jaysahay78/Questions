import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        func(ans, new ArrayList<>(), 0, candidates, target);
        return ans;

    }
    static void func(List<List<Integer>> ans, List<Integer> list, int ind, int[] arr, int target){
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (ind == arr.length || target < 0) return;

        if(arr[ind] <= target){
            list.add(arr[ind]);
            func(ans, list, ind, arr, target - arr[ind]);
            list.remove(list.size()-1);
        }
        func(ans, list, ind+1, arr, target);
    }
}
