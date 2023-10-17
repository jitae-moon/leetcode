class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int reader = 1, writer = 1, prevNum = nums[0];
        

        while (reader < n) {
            if (nums[reader] == prevNum) {
                reader++;
            } else {
                prevNum = nums[reader];
                nums[writer] = nums[reader];
                writer++;
                reader++;
            }
        }
        
        return writer;
    }
}