package day73_intermediate_DSA_linked_list_basics.classprograms;

public class Q1_LengthOfLinkedList {
    static Node head;
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static int length_ll() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            System.out.println(temp.value);
            temp = temp.next;
        }
        return count;
    }

    public void addHead(Node head, int value) {

        Node newNode = new Node(20);
        newNode.next = head;
        head = newNode;

    }

    public void deleteHead(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node temp = head;
        head = head.next;
    }

    public void addAtEnd(Node head, int val) {

        Node newNode = new Node(30);
        if (head == null) {
            head = newNode;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode = newNode;
    }

}
