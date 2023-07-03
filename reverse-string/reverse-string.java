class Solution {
    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
    
    public void helper(char[] chArr, int  left, int right) {
        if (left >= right) return;
        char tmp = chArr[left];
        chArr[left] = chArr[right];
        chArr[right] = tmp;
        helper(chArr, left + 1, right - 1);
    }
}