import java.util.Scanner;
public class Strongnumber {


    public static int factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;

        }
        return fact;
    }

    public static boolean isStrongNumber(int number)
    {
        int sum=0;
        int temp=number;
        while(temp!=0)
        {
            int digit = temp % 10;
            sum= sum + factorial(digit);
            temp = temp / 10;
        }
        return sum==number;
    }


    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        if (isStrongNumber(number)) {
            System.out.println("is a strong number");
        } else {
            System.out.println("is not strong number");
        }
    }
}
