package myprogrames;
import java.util.Scanner;


public class fibnociiwithoutrecurtion {
    public static void main(String args[]){
        
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[100];
         arr[0]=0;
         arr[1]=1;
        for(int i=2;i<=n;i++){
           arr[i]=arr[i-1]+arr[i-2]; 
        }
        for(int i=0;i<=n;i++){
            System.out.print(""+arr[i]+" ");
        }
    }
}
