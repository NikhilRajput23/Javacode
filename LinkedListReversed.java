class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListReversed {
    // Iterative method
    public static Node reverseIterative(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next; // store next
            curr.next = prev;      // reverse link
            prev = curr;           // move prev forward
            curr = next;           // move curr forward
        }

        return prev; // new head
    }

    // Utility function to print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        printList(head);

        head = reverseIterative(head);

        System.out.println("Reversed List (Iterative):");
        printList(head);
    }
}
