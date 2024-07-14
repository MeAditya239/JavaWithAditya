
class Student
{
    private int id;
    private int age;
    private double per;

    //getters
    public int getId() {
        return id;
    }
    public int getAge()
    {
        return age;

    }
    public double getPer() {
        return per;
    }


    //Setters
    public void setId(int id)
    {
        this.id=id;

    }
    public void setAge(int age)
    {
        this.age=age;

    }
    public void setPer( double per)
    {
        this.per=per;

    }

}
class Setter_Getter

{
    public static void main(String [] args){
        //Scanner sc =new Scanner(System.in);
        Student s1=new Student();
        s1.setId(11);
        s1.setAge(23);
        s1.setPer(89.67);

        System.out.println("Student 1: Id" + s1.getId()+"\t Age :"+s1.getAge()+ "\t Percentage :" +s1.getPer());

        Student s2= new Student();

        s2.setId(45);
        s2.setAge(25);
        s2.setPer(90.67);

        System.out.println("Student 2: Id" + s2.getId()+"\t Age :"+s2.getAge()+ "\t Percentage :" +s2.getPer());

        System.out.println("\n Details of Elder student:");
        if (s1.getAge()>s2.getAge())
            System.out.println("Student 1:ID:" +s1.getId() + "\t Age : "+ s1.getAge()+ "\t Percentage : "+ s1.getPer());
        else
            System.out.println("Student 2: ID:" + s2.getId()  + "\t Age : "+ s2.getAge() +  "\t Percentage: "+ s2.getPer());

    }
}
