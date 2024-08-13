class LinkedList {
    Node head; // head of list

    // Linked list Node.
    // This inner class is made static so that main() can access it
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the end
    public void append(int data) {
        Node newNode = new Node(data);

        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = newNode;
            return;
        }

        // Else traverse till the last node and insert the newNode there
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Method to delete a node by key
    public void deleteByKey(int key) {
        Node temp = head, prev = null;

        // If the head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        // as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) {
            System.out.println("Key " + key + " not found");
            return;
        }

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    // Method to print the LinkedList
    public void printList() {
        Node currNode = head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

        System.out.println();
    }

    // Main method to test the LinkedList implementation
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert nodes
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        // Print the LinkedList
        list.printList();

        // Delete node with key 3
        list.deleteByKey(3);

        // Print the LinkedList again
        list.printList();
    }
}
