import java.util.Scanner;

public class DoubleLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter data:");
            data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.next = head;
            } else {
                new_node.next = head;
                head = new_node;
                tail.next = head;
            }
            System.out.println("Do you want to add more data? If yes, press 1:");
            n = sc.nextInt();
        } while (n == 1);

        sc.close(); // Close the scanner
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("LinkedList does not exist.");
        } else {

            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println(); // Move to the next line after printing all data
        }
    }

    public static void main(String[] args) {
        DoubleLL l1 = new DoubleLL();
        l1.creation();
        l1.traverse();
    }
}
