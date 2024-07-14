import java.util.*;
class Classmethods{
    private int code=0;
    private double sal =0;
    public void in()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the employee code");
        code=sc.nextInt();
        System.out.println("Enter the salary");
        sal=sc.nextDouble();


    }
    public void out()
    {
        System.out.println("The employee code is "+ code+"\tand the salary is "+sal);

    }

}
class Mainclassmethods{
    public static void main(String [] args )
    {
        Classmethods c1 = new Classmethods();
        c1.in();
        c1.out();

        Classmethods c2=new Classmethods();
        c2.in();
        c2.out();
    }
}
