package myprogrames;

public class Threading2 
{
  public static void main(String []args)
  {
      C o1=new C();
      D o2=new D();
      o1.start();
      o2.start();
  }
}
 class C extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<=10;i++)
            System.out.println("THREAD C: i= "+i);
        
    }
}
 class D extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<=10;i++)
            System.out.println("THREAD D: i= "+i);
        
    }
}

