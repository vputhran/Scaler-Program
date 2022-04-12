package day73_intermediate_DSA_linked_list_basics.assignments;

public class Q1_Linked_List {
    static Node head;
    static int size_of_ll = 0;

    static class Node {
        int value;
        Node next;
        public Node() {
            this.value = value;
            this.next = null;
        }
    }

    public static void insert_node(int position, int value) {

        if (position >= 1 && position <= size_of_ll + 1) {
            Node temp = new Node();
            temp.value = value;
            if (position == 1) {
                temp.next = head;
                head = temp;
            }else {
                int count = 1;
                Node prev = head;
                while (count < position - 1) {
                    prev = prev.next;
                    count++;
                }
                temp.next = prev.next;
                prev.next = temp;
            }
            size_of_ll++;
        }
    }

    public static void delete_node(int position) {
        if (position >= 1 && position <= size_of_ll) {
            Node temp = null;
            if (position == 1) {
                temp = head;
                head = head.next;
            } else {
                int count = 1;
                Node prev = head;
                while (count < position - 1) {
                    prev = prev.next;
                    count++;
                }
                temp = prev.next;
                prev.next = prev.next.next;
            }
            size_of_ll--;
        }
    }

    public static void print_ll() {
        Node temp = head;
        int flag = 0;
        while (temp != null) {
            if (flag == 0) {
                System.out.println(temp.value);
                flag = 1;
            }else
                System.out.println(" "+temp.value);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

    }
}
