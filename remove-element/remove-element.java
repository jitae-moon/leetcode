class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int reader = 0;
        int writer = 0;
        int cnt = 0;

        while (reader < len) {
            if (nums[reader] == val) {
                reader++;
            } else {
                nums[writer] = nums[reader];
                writer++;
                reader++;
                cnt++;
            }
        }
        System.out.println(Arrays.toString(nums));

        return cnt;
    }
}