package myprogrames;
import java.util.Scanner;

public class GreatestNo 
{
   public static void main(String[]args)
   {
       System.out.println("Enter three numbers");
       Scanner sc1=new Scanner(System.in);
       Scanner sc2=new Scanner(System.in);
       Scanner sc3=new Scanner(System.in);
       int a=sc1.nextInt();
       int b=sc2.nextInt();
       int c=sc3.nextInt();
      if(a>=b&&a>=c)
          System.out.println(a+" is greatest number");
      else if(b>=a&&b>=c)
          System.out.println(b+" is greatest number");
      else
          System.out.println(c+" is greatest number");
      System.out.println("");
      System.out.println("By ASHISH KUMAR SAH");
   }
}
