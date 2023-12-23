import java.math.*;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        
        for (int digit : digits) {
            sb.append(digit);
        }
        
        String numStr = sb.toString();

        BigInteger num = new BigInteger(numStr);
        
        String res = num.add(BigInteger.ONE).toString();

        int len = res.length();
        
        int[] ans = new int[len];
        
        for (int i = 0; i < len; i++) {
            ans[i] = res.charAt(i) - '0';
        }
        
        return ans;
    }
}