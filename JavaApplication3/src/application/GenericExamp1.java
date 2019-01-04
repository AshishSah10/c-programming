package application;

public class GenericExamp1 
{
  public <E> void printarray(E []s)
  {
      for(int i=0;i<s.length;i++)
          System.out.println(s[i]);
  }
  public static void main(String[]args)
  {
     GenericExamp1 o1=new GenericExamp1();
     String  []country=new String[]{"india","nepal","usa"};
     Integer number[]={11,12,13,15};
     o1.printarray(country);
     o1.printarray(number);
  }
}
