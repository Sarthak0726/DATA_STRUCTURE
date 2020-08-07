import java.util.*;

public class InsertBegin {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    public void inBeg(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        InsertBegin ob = new InsertBegin();
        ob.inBeg(10);
        ob.inBeg(20);
        ob.inBeg(30);
        ob.display();
    }
}