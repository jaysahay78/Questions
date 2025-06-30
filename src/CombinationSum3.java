import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    static List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        func(ans, new ArrayList<>(), 0, nums, n, k);
        return ans;
    }
    static void func(List<List<Integer>> ans, List<Integer> list, int ind, int[] arr, int target, int k){
        if(target == 0 && list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = ind; i< arr.length; i++){
            if( i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target || list.size() == k) break;

            list.add(arr[i]);
            func(ans, list, i+1, arr, target-arr[i], k);

            list.remove(list.size()-1);
        }
    }
}
