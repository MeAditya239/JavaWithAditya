import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ItrDemo {
    public static void main(String [] args)
    {
        List l= new ArrayList();
        l.add(10);
        l.add("deepak");
        l.add("rahula");

        Iterator itr = l.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
