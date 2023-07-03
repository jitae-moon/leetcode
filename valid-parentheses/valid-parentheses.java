import java.util.*;

class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            try {
                if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else if (ch == ')') {
                if (stack.peek() == '(') stack.pop();
                else return false;
            } else if (ch == '}') {
                if (stack.peek() == '{') stack.pop();
                else return false;
            } else {
                if (stack.peek() == '[') stack.pop();
                else return false;
            }
            } catch (Exception e) {
                return false;
            }
        }
        return stack.isEmpty();
        

    }
}