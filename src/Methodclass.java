class Methodclass
{
    public  void show()
    {
        System.out.println("This is the msg from  show () method ");
    }
    public static void main(String [] args)
    {
        System.out.println("hello this is msg from main method");
        Methodclass m = new Methodclass();

        m.show();
    }
}
