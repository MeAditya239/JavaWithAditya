import java.util.Scanner;

public class Arraydatastructure1 {
    public static void main(String [] args)
    {
        int n,i=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of points");
        n=sc.nextInt();

        int []a=new int[n];

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }

        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);

        }

    }
}
