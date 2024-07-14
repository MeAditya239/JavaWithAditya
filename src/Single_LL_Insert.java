import java.util.Scanner;

class Single_LL_Insert {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null; // Properly initialize next to null
        }
    }

    Node head = null;

    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter data:");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            } else {
                System.out.println("Enter 1 to insert the item at beginning, 2 to insert the item at end, 3 to insert the item at a specific location");
                m = sc.nextInt();

                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node; // Corrected to set new_node at the end
                        break;

                    case 3:
                        System.out.println("Enter position of node to be inserted:");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;

                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
            System.out.println("Do you want to add more data? If yes, press 1:");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        Node temp = head;

        if (head == null) {
            System.out.println("Linked List does not exist");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Single_LL_Insert l1 = new Single_LL_Insert();
        l1.creation();
        l1.traverse();
    }
}
