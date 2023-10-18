class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int read = 0;
        int write = 0;
        
        for (read = 0; read < n; read++) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            } 
        }
        
        for (; write < n; write++) {
            nums[write] = 0;
        }
    }
}