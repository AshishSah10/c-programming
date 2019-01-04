package myprogrames;

public class Threading1
{
 public static void main(String []args)
 {
    // A a1=new A();
    // B b1=new B();
     Thread t1=new Thread(new A());
     Thread t2=new Thread(new B());
     t1.start();     //a1.run();
     t2.start();      //b1.run();
 }
}
class A implements Runnable
{
    public void run()
    {
    int i;
    for(i=0;i<=10;i++)
    System.out.println("THREAD A: "+i);
    }
}
class B implements Runnable
{
    public void run()
    {
    int i;
    for(i=0;i<=10;i++)
    System.out.println("THREAD B: "+i);
    }
}