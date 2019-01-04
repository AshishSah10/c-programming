package myprogrames;
import java.util.Scanner;

public class Factorial 
{
    public static void main(String []args)
    {
      System.out.println("Enter a number to find its factorial ");
      Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int i,fact=1;
     for(i=0;i<num;i++)
     {
     fact=fact*(num-i);
     }
     System.out.println("factorial of given number is "+fact);
     System.out.println("");
     System.out.println("By ASHISH KUMAR SAH");
    }
}
