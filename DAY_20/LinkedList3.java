class LinkedList3 {
    Node head;

    public void deleteNode(int key) {
        Node temp = head, prev = null;

        // If the head node holds the key
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If the key was not present in the list
        if (temp == null) return;

        // Unlink the node from the linked list
        prev.next = temp.next;
    }
}
