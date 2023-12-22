class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;

        for (int i = 1; i < n; i++) right += nums[i];
        
        // Return 0 if left == right
        if (left == right) return 0;
        
        for (int i = 1; i < n; i++) {
            left += nums[i - 1];
            right -= nums[i];
            
            if (left == right) return i;
        }
        
        return -1;
    }
}