package myprogrames;
import java.util.Scanner;
import java.lang.Math;

public class palindrome {
    public static void main(String args[]){
                int flag=-1;
        System.out.println("enter a number");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
  String temp = Integer.toString(n);
int[] n1 = new int[temp.length()];
for (int i = 0; i < temp.length(); i++)
{
    n1[i] = temp.charAt(i) ;
}
     int len=n1.length;       
        for(int i=0;i<=Math.ceil(len/2);i++){
            if(n1[i]==n1[len-1-i])
                flag++;
        }
        if(flag==Math.ceil(len/2))
            System.out.println(""+n+" is a palindrome");
        else
            System.out.println(""+n+" is not a palindrome");
        
        
    }
}
