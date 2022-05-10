package day75_intermediate_DSA_trees_basics_1;

import java.util.ArrayList;
import java.util.Stack;

public class Q1_InorderTraversal {
    public static void main(String[] args) {

        Solution s1 = new Solution();
    }

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }

    public static class Solution {
        public ArrayList<Integer> inorderTraversal(TreeNode A) {
            ArrayList<Integer> ans = new ArrayList<>();
            Stack<TreeNode> st = new Stack<>();

            while (A != null && !st.empty()) {
                if (A != null) {
                    st.push(A);
                    A = A.left;
                } else {
                    st.pop();
                    ans.add(A.val);
                    A = A.right;
                }
            }
            return ans;
        }
    }
}
