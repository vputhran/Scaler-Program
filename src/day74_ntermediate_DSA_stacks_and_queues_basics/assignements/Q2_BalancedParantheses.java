package day74_ntermediate_DSA_stacks_and_queues_basics.assignements;

import java.util.LinkedList;

public class Q2_BalancedParantheses {
    public static void main(String[] args) {
//        String A = "(()())";
//        String A = "(()";
//        String A = "))((()(())";
//        String A = "()";
        String A = "(()((((()(";

        System.out.println(solve(A));
    }
    public static int solve(String A) {
        LinkedList<Character> stk = new LinkedList<>();

        for (int i = 0; i < A.length(); i++) {
            // If '(', push it into the stack
            if (A.charAt(i) == '(') {
                stk.push(A.charAt(i));
            } else if (A.charAt(i) == ')' && stk.isEmpty()) { // If ')' and stack is empty return 0
                return 0;
            } else {     // Else if ')' pop the stack
                stk.pop();
            }
        }
        if (stk.isEmpty()) {
            return 1;
        }else return 0;
    }
}
