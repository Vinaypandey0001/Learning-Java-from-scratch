public class LinkedList {
   private Node head;

   public void add(int data) {
      Node newNode = new Node(data);
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

   // Other methods for traversal, deletion, etc.

   private static class Node {
      int data;
      Node next;

      Node(int data) {
         this.data = data;
         this.next = null;
      }
   }
}
