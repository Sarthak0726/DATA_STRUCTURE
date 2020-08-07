import java.util.*;

public class InsertEnd {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    public void inEnd(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            Node lst = head;
            while (lst.next != null) {
                lst = lst.next;
            }
            lst.next = temp;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertEnd ob = new InsertEnd();
        ob.inEnd(40);
        ob.inEnd(50);
        ob.display();
    }
}