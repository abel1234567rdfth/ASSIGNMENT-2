package on_linkedlist;

public class Linked_list {
	public Node head;

    public Linked_list() {
        this.head = null;
    }

    // Method to insert a node at a specified position
    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) { // Insert at the beginning
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to delete a node at a specified position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of bounds");
            return;
        }

        current.next = current.next.next;
    }

    // Method to delete the node that occurs after a given node
    public void deleteAfterNode(Node node) {
        if (node == null || node.next == null) {
            System.out.println("No node to delete");
            return;
        }

        node.next = node.next.next;
    }

    // Method to search for a node with a specific value
    public boolean searchNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
