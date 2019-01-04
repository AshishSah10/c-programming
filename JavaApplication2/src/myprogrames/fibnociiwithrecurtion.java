 package myprogrames;
import java.util.Scanner;

public class fibnociiwithrecurtion {
    public static void main(String args[]){
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("0"+"1");
            function.fibo(a-2);
    }
    static class function{
       static int n1=0,n2=1,n3;
      static void fibo(int a){
         if(a>0){
          
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.println(""+n3);
                fibo(a-1);
           }
}
}
}
    
    

