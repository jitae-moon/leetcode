class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (max >= 2 * nums[i] || i == maxIdx) continue;
            else {
                return -1;
            }
        }
        return maxIdx;
    }
}