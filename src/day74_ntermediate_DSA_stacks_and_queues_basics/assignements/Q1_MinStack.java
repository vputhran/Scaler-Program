package day74_ntermediate_DSA_stacks_and_queues_basics.assignements;

import java.util.LinkedList;

public class Q1_MinStack {
    public static void main(String[] args) {
        Solution s1 = new Solution();
    }


    static class Solution {
        LinkedList<Integer> stack1 = new LinkedList<>();
        LinkedList<Integer> minStack = new LinkedList<>();

        public void push(int x) {
            if (stack1.isEmpty()) {
                stack1.push(x);
                minStack.push(x);
            } else if (x <= minStack.getFirst()) {
                stack1.push(x);
                minStack.push(x);
            } else {
                stack1.push(x);
            }
        }


        public void pop() {
            if (!stack1.isEmpty()){
                if (stack1.getFirst().equals(minStack.getFirst())) {
                    stack1.remove();
                    minStack.remove();
                }
            }
        }

        public int top() {
            if (stack1.isEmpty()) {
                return -1;
            } else {
                return stack1.getFirst();
            }
        }

        public int getMin() {
            if (!minStack.isEmpty()) {
                return minStack.getFirst();
            }
            return -1;
        }
    }
}
