package myprogrames;

public class ExampleInheritance1 
{
    public static void main(String []args)
    {
      Person p1=new Person();
      Student s1=new Student();
      p1.info();
      s1.Studentinfo();
      System.out.println("");
      System.out.println("By ASHISH KUMAR SAH");
    }
}
class Person
{
   int age=18;
   String name="ASHISH SAH";
    void info()
    {
    this.age=18;
    this.name="ASHISH SAH";
    System.out.println("Age: "+age+"  Name: "+name);
    }
}
class Student extends Person
{
    void Studentinfo()
    {
        String section="BTECH 2ND YEAR";
        int studentid=1210;
        System.out.println("Age: "+age+"  Name: "+name);
        System.out.println("Section: "+section+"  ID: "+studentid);
    }
}