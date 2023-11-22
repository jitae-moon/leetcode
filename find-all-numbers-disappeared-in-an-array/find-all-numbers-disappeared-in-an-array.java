class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        
        int[] arr = new int[n + 1];
        
        for (int i = 0; i <= n; i++) arr[i] = 1;
        
        for (int num : nums) {
            arr[num] = 0;
        }
        
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (arr[i] == 1) ans.add(i);
        }
        
        return ans;
    }
}