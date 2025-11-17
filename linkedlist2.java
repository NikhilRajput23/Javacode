// Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Singly Linked List class
public class linkedlist2{
    private Node head;

    public linkedlist2() {
        head = null;
    }

    // Insert at end
    public void insertEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Insert at beginning
    public void insertBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Delete a node by value (first occurrence)
    public void deleteByValue(int value) {
        if (head == null) {
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node current = head;
        Node prev = null;
        while (current != null && current.data != value) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Value not found");
            return;
        }
        // remove current
        prev.next = current.next;
    }

    // Search for a value
    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Traverse / print
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main to test
    public static void main(String[] args) {
        linkedlist2 list = new linkedlist2();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertBeginning(5);
        list.printList();        // 5 -> 10 -> 20 -> null
        System.out.println(list.search(20)); // true
        list.deleteByValue(10);
        list.printList();        // 5 -> 20 -> null
    }
}
