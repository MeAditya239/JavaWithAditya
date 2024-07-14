import java.util.*;
class Demo
{
    private int x;
    private double y;
    public Demo()
    {
        System.out.println("this is default constructor");

    }


    public void in()
    {
        System.out.println("This is input section");

    }
    public void out()
    {
        System.out.println("This is output section");

    }
}
class ConstructorDefault
{
    public static void main(String [] args)
{
    Demo obj=new Demo();
    obj.in();
    obj.out();

}
}