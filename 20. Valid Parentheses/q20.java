
import java.util.Stack;


public class q20 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String exp = "{3453}";
        System.out.println(s.isValid(exp));
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            switch (c) {
                case '(', '{', '[' -> stk.push(opposite(c));
                case ')', '}', ']' -> {
                    if (stk.isEmpty()) return false;
                    if (stk.pop() != c){
                        return false;
                    }
                }
                default -> {
                }
            }
        }
        return stk.isEmpty();
    }

    public char opposite(char c){
        return switch (c) {
            case ')' -> '(';
            case '}' -> '{';
            case ']' -> '[';
            case '(' -> ')';
            case '{' -> '}';
            case '[' -> ']';
            default -> ' ';
        };
    }
}