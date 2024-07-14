import java.util.*;
class Method{
    private int code;
    private double per;
    public void in()
    {
        Scanner sc = new Scanner(System.in);
        code=sc.nextInt();
        per=sc.nextDouble();
    }
    public void in(int t1,double t2)
    {
        code=t1;
        per=t2;
    }
    public void out()
    {
        System.out.println("code"+code+"per"+per);
    }
}

class Methodsexample
{
    public static void main(String [] args)
    {
        Method m1=new Method();
        m1.in();
        m1.out();

        Method m2 = new Method ();
        m2.in(32,55);
        m2.out();

    }
}

