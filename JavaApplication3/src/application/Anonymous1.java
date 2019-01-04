package application;

public class Anonymous1 
{
   public static void main(String[]args)
   {
    Outer o1=new Outer();
    Outer.Inner o2=o1.new Inner();
    o2.fun1();
    o1.p.fun1();
   }    
}
class Parent
{
    public void fun1()
    {
    }
}
class Outer
{
    public class Inner extends Parent 
    {
        public void fun1()
        {
            System.out.println("in innner class");
        }
    }
    Parent p=new Parent()
    {
       public void fun1()
       {
           System.out.println("in Anonymous class");
       } 
    };
}