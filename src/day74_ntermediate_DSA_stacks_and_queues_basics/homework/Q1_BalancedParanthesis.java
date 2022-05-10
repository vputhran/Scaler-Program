package day74_ntermediate_DSA_stacks_and_queues_basics.homework;

import java.util.LinkedList;

public class Q1_BalancedParanthesis {
    public static void main(String[] args) {
        String A = "({)}";
//        String A = "()[]";
//        String A = "(){";
//        String A = "{([])}";

        System.out.println(solve(A));
    }

    public static int solve(String A) {
        LinkedList<Character> stk = new LinkedList<>();

        for (int i = 0; i < A.length(); i++) {
            // If '(', push it into the stack
            if ((A.charAt(i) == '(') || (A.charAt(i) == '{') || (A.charAt(i) == '[')) {
                stk.push(A.charAt(i));
            } // If ')' and stack is empty return 0
            else if (stk.isEmpty()) {
                if ((A.charAt(i) == ')') || (A.charAt(i) == '}') || (A.charAt(i) == ']')) {
                    return 0;
                }
                // Else if ')' pop the stack
            } else if ((A.charAt(i) == ')' && stk.getFirst() != '(') || (A.charAt(i) == '}' && stk.getFirst() != '{') || (A.charAt(i) == ']' && stk.getFirst() != '[')) {
                return 0;
            } else {
                stk.pop();
            }
        }
        if (stk.isEmpty()) {
            return 1;
        }else return 0;
    }

}
