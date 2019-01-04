package myprogrames;
public class OurThrowDefaultCatch 
{
  public static void main(String []args)
  {
      int balance=5000;
      int withdrawlamount=6000;
      if(balance<withdrawlamount)
          throw new ArithmeticException("insufficient balance");
      balance=balance-withdrawlamount;
      System.out.println("transition succesful");
      System.out.println("program continue");
  }
}
