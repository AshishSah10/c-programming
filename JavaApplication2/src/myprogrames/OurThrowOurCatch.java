package myprogrames;
public class OurThrowOurCatch 
{
  public static void main(String []args)
  {
      int balance=5000;
      int withdrawlamount=6000;
      try
      {
      if(balance<withdrawlamount)
          throw new ArithmeticException("insufficient balance");
      balance=balance-withdrawlamount;
      System.out.println("transition succesful");
      }
      catch(ArithmeticException e)
              {
                  System.out.println("Exception: "+e.getMessage());
              }
      finally{
          System.out.println("program continue");
      }
      
  }
}
