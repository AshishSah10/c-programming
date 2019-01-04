package myprogrames;
import java.util.Scanner;

public class EvenOdd 
{
  public static void main(String []args)
  {
      System.out.println("enter a number");
      Scanner sc=new Scanner(System.in);
      int c=sc.nextInt();
      if(c%2==0)
          System.out.println("Entered number is even");
     else
          System.out.println("Entered enter a number is odd");
      System.out.println("");
      System.out.println("By ASHISH KUMAR SAH");
  }
}
