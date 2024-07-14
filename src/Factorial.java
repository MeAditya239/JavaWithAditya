import java.util.Scanner;
class Formula{
    int f=1;
    int num=0;
    int fact(int num)
    {
        for(int i=1;i<=num;i++)
        {
            f=f*i;

        }
        return f;
    }

    void display()
    {
        System.out.println(f);
    }
}
class Factorial
{
    public static void main(String [] args)
    {
        Formula f1=new Formula();
        f1.fact(5);
        f1.display();
    }
}
