import java.util.Scanner;
public class Single_LL_Deletion
{
    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;

        }
    }
    Node  head = null;

    public void creation() {
        int data, n = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter data:");
            data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                Node temp =head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new_node;
            }
            System.out.println("Do you want to add more data? If yes, press 1:");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("LinkedList does not exist.");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void deletion()
    {
       Node temp =head;
       head=head.next;
       temp.next=null;
    }

    public static void main(String [] args)
    {
        Single_LL_Deletion d1= new Single_LL_Deletion();
        d1.creation();
        d1.traverse();
        d1.deletion();
        d1.traverse();
    }
}
