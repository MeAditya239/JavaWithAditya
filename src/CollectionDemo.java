import java.util.ArrayList;
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);
        System.out.println(al.size());                  //methods for size check
        al.remove(0);                               //here 0 is not an object, it is an index
        System.out.println(al);
// next
        ArrayList al2 = new ArrayList();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");
        System.out.println(al2);

        al.addAll(al2);
        System.out.println(al);

        System.out.println("next one");
        System.out.println(al.contains(200));
        System.out.println(al.isEmpty());


        ArrayList al3 = new ArrayList();
        System.out.println(al3.isEmpty());   //check for empty or not

        //remove methods method
        System.out.println("this is remove methods");
        ArrayList bl= new ArrayList();
        bl.add(10);
        bl.add(20);
        bl.add(30);
        bl.add(40);
        bl.removeAll(bl);                       //we can also used bl.clear()
        System.out.println(bl);

    }
}




