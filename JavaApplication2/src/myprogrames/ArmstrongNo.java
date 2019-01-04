package myprogrames;
import java.util.Scanner;

public class ArmstrongNo 
{
 public static void main(String[]args)
 {
   System.out.println("Enter a three-digit number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r,s=0,temp=n;
    while(n%10!=0)
    {
        r=n%10;
        s=s+(r*r*r);
        n=n/10;
    }
    if(temp==s)
         System.out.println(temp+" is an Armstrong Number");
    else
         System.out.println(temp+" is not an Armstrong Number");
     System.out.println("");
      System.out.println("By ASHISH KUMAR SAH");
 }
}
