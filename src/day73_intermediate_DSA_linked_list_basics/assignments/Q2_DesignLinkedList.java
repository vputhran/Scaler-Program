package day73_intermediate_DSA_linked_list_basics.assignments;

import java.util.ArrayList;

public class Q2_DesignLinkedList {
    /**
     * Definition for singly-linked list.   */
      class ListNode {
          public int val;
          public ListNode next;
          ListNode(int x) { val = x; next = null; }
      }


    /* Reference: https://www.scaler.com/academy/mentee-dashboard/class/21261/assignment/problems/4371/discussion/p/how-to-design-linked-list/12903 */
    public class Solution {

        ListNode head;
        int size = 0;

        public ListNode solve(ArrayList<ArrayList<Integer>> A) {
            for (int i = 0; i < A.size(); i++) {
                if (A.get(i).get(0) == 0) {
                    addAtFirst(A.get(i).get(1));
                } else if (A.get(i).get(0) == 1) {
                    addAtLast(A.get(i).get(1));
                } else if (A.get(i).get(0) == 2) {
                    addNode(A.get(i).get(1), A.get(i).get(2));
                } else if (A.get(i).get(0) == 3) {
                    deleteByValue(A.get(i).get(2), A.get(i).get(1));
                }
            }
            return head;
        }

        public void addAtFirst(int value) {
            if (head == null){
                head = new ListNode(value);
            } else {
                ListNode newNode = new ListNode(value);
                newNode.next = head;
                head = newNode;
            }
            size += 1;
        }

        public void addAtLast(int value){
            ListNode newnode = new ListNode(value);
            ListNode temp = head;
            if (head == null) {
                head = newnode;
            } else {
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = newnode;
            }
            size += 1;
        }

        public void addAtIndex(int value, int index){
            int count = 0;
            ListNode temp = head;
            while (count < index - 1) {
                temp = temp.next;
                count++;
            }
            ListNode newNode = new ListNode(value);
            newNode.next = temp.next;
            temp.next = newNode;
            size += 1;
        }

        public void addNode(int value, int index){
            if (index == size){
                addAtLast(value);
            } else if (index > size || index < 0){
                return;
            } else if (index == 0) {
                addAtFirst(value);
            } else {
                addAtIndex(value, index);
            }
        }

        public void deleteByValue(int value, int position){
            if (head == null) return;
            ListNode ptr = head;
            if (position < size) {
                if (position == 0){
                    head = head.next;
                } else {
                    for(int k = 0;k < position - 1;k++) {
                        ptr = ptr.next;
                    }
                    ptr.next = ptr.next.next;
                }
                size -= 1;
            }
        }
    }
}
