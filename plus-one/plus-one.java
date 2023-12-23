import java.math.*;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        
        for (int digit : digits) {
            sb.append(digit);
        }
        
        String numStr = sb.toString();

        BigInteger num1 = new BigInteger(numStr);
        BigInteger num2 = new BigInteger("1");
        
        String res = num1.add(num2).toString();

        int len = res.length();
        
        int[] ans = new int[len];
        
        for (int i = 0; i < len; i++) {
            ans[i] = res.charAt(i) - '0';
        }
        
        return ans;
    }
}