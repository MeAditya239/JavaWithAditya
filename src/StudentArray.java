import java.util.*;
class Students {
     private int id;
     private double per;
     public void in ( int t1, double t2)
     {
         id =t1;
         per=t2;

     }
     public void out()
     {
         System.out.println("\n Student ID:"+id+ "\n Percentage : "+per);

     }
}
class StudentArray{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner (System.in);
        Students []s = new Students[3];
        for(int i=0;i<3;i++) {
            s[i] = new Students();
            System.out.println("Enter the student Id:");
            int sid = sc.nextInt();
            System.out.println("Enter the percentage");
            double sper = sc.nextDouble();
            s[i].in(sid, sper);
        }
        System.out.println("\n Student list");
        for (int i=0;i<3;i++)
        {
            s[i].out();
        }


    }

}
