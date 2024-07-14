class Node
{
    int data;
    Node next;

    //constructor
    Node(int data)
    {
        this.data=data;
        this.next=next;
    }
}

class Linked_List_count_elements
{
    Node head;
    //Methos to count the number of nodes in LL
    public int countnodes(){
        int count =0;
        Node temp =head;
        while (temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;

    }

    public void add(int data){
        Node new_node=new Node(data);

        if(head==null) {
            head = new_node;
        }
        else {
            Node temp=head;
            while(temp.next!=null) {
                temp = temp.next;
            }

            temp.next = new_node;
        }
    }


    public static void main(String [] args)
    {
        Linked_List_count_elements l1= new Linked_List_count_elements();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        System.out.println("Number of nodes in linked list: "+ l1.countnodes());
    }

}