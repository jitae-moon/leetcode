class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for (int num: nums) {
            String tmp = String.valueOf(num);
            if (tmp.length() % 2 == 0) cnt++;
        }
        return cnt;
    }
}