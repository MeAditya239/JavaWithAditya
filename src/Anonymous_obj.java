class Anonymous
{
    public void show()
    {
        System.out.println("In the Anonymous class-show method ");
    }
}
class  Anonymous_obj{
    public static void main( String [] args)
    {   //obj created for anonymous class
        new Anonymous().show();
    }
}
