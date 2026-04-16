class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for(int ind : queries){
            List<Integer> list = map.get(nums[ind]);
            int size = list.size();
            if(list.size() == 1){
                ans.add(-1);
                continue;
            }
            int pos = Collections.binarySearch(list, ind);

            int prev = list.get((pos-1+size) % size);
            int next = list.get((pos + 1) % size);

            int d1 = Math.abs(ind - prev);
            int d2 = Math.abs(ind - next);

            int temp = Math.min(Math.min(d1,n-d1), Math.min(d2, n-d2));
            ans.add(temp);
        }
        return ans;
    }
}