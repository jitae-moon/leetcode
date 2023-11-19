class Solution {
    public int thirdMax(int[] nums) {
        // If array's length is 0, max doesn't exist
        if (nums.length == 0) return -1;
        
        // Sort the array
        Arrays.sort(nums);

        int n = nums.length;
        int k = 1;
        int max = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                k++;
                if (k == 3) {
                    return nums[i];
                }
            }
        }
        
        return max;
    }
}