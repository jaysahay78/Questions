import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        generate(ans, new ArrayList<>(), nums, 0);
        return ans;

    }
    static void generate(List<List<Integer>> list, List<Integer> numbers, int[] nums, int index){

        if(index >= nums.length){
            list.add(new ArrayList<>(numbers)); //add a new list every single time and not the same one over and over
            return;
        }

        numbers.add(nums[index]);
        generate(list, numbers, nums, index+1);

        numbers.remove(numbers.size()-1);
        generate(list, numbers, nums, index+1);
    }

    public static void main(String[] args) {

    }
}
