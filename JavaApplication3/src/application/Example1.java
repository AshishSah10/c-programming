package application;

public class Example1 
{
    static String s1[]=new String[]{"ashish","kumar","sah"};
    //String s2[]={"Mount","Zion","School"};
    
    public void printarray(String []k){
     for(int i=0;i<k.length;i++)
      System.out.println(k[i]);    
    }
    
    public static void main(String[]args){
         String s2[]={"Mount","Zion","School"};
      Example1 e1=new Example1(); 
      for(int i=0;i<s1.length;i++)
      System.out.println(e1.s1[i]);
      e1.printarray(s2); 
    } 
    
}
