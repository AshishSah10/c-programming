package myprogrames;
import java.util.Scanner;

public class primenumber {
    //static int flag=0;
    public static void main(String args[]){
        int flag=0;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    for(int i=2;i<n/2;i++){
       // int flag=0;
        if(n % i==0 ){
            
           flag=1;
       break;
        }
    }
           if(flag==0)
  System.out.println(""+n+" is a prime  number"); 
           else
                System.out.println(""+n+" is not a prime  number");
        }
}
    
    
