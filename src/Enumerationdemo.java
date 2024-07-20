import java.util.Enumeration;
import java.util.Vector;
public class Enumerationdemo {
    public static void main(String [] args){
        Vector v= new Vector();

        v.add(10);
        v.add("Aditya");
        v.add(10.5);

        System.out.println(v);
//hasMoreElements()        returns boolean value
        //nextElements()    returns object

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
