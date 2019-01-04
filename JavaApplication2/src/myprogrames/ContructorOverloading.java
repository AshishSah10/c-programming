package myprogrames;

public class ContructorOverloading 
{
 public static void main(String []args)
 {
   Example1 e1=new Example1();
   Example1 e2=new Example1(4);
   System.out.println("");
   System.out.println("BY ASHISH KUMAR SAH");
 }
    
}
   class Example1
            {
                public Example1()
                {
                    System.out.println("IN 1ST METHOD");
                }
                public Example1(int i)
                {
                    System.out.println("IN OVERLOADED METHOD");
                }
            }
