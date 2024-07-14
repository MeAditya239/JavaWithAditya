import java.util.*;

class Item {
    private int icode;
    private double ipr;

    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the item code:");
        icode = sc.nextInt();
        System.out.println("\n Enter the item price:");
        ipr = sc.nextDouble();
    }

    public void showData() {
        System.out.println("\n item code :" + icode + "\t Price:" + ipr);

    }

    public double getPrice() {
        return ipr;

    }
}
class FindBill{
    public static void main(String  [] args){
        Item [] ilist = new Item[3];
        System.out.println("Enter the information of 3 items");
        for( int i =0;i<3;i++)
        {
            ilist[i] =new Item();
            ilist[i].setData();

        }
        System.out.println("\n List of Items");
        for(int i =0;i<3;i++)
        {
            ilist[i].showData();

        }
        //find total bill
        double tot =0.0;
        for(int i=0;i<3;i++)
        {
            tot=tot +ilist[i].getPrice();
        }
        System.out.println("\n Total Bill:"+ tot);
    }
}