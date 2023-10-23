class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;

        int cnt = 0;
        int ans = 0;
        while (left <= right && right < n) {
            if (nums[right] != 0) {
                right++;
            } else {
                if (cnt == 1) {
                    ans = Math.max(ans, right - left);
                    cnt = 0;
                    while (nums[left] != 0) {
                        left++;
                    }
                    left++;
                    cnt = 0;
                } else {
                    cnt = 1;
                    right++;
                }
            }
        }
        ans = Math.max(ans, right - left);

        return ans;
    }
}