import java.util.*;
class Demo1 {
    private int x;
    private double y;

    public Demo1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        x = sc.nextInt();
        y = sc.nextDouble();

    }

    public Demo1(Demo1 t)           //copy constructor
    {
        x = t.x;
        y = t.y;
    }

    public void showData() {
        System.out.println("\n x=" + x + "\t y=" + y);


    }
}
class CopyConstructor
{public static void main(String [] args)
{   Demo1 ob1 = new Demo1();
    ob1.showData();

    Demo1 ob2=new Demo1(ob1);
    ob2.showData();


}}
