class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if ((nums[left] % 2 == 1) && (nums[right] % 2 == 0)) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            } else if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 == 1) {
                right--;
            }
        }
        
        return nums;
    }
}