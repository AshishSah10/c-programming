package application;
import java.util.*;

public class Arraylist1 
{
    public static void main(String[]args)
    {
      ArrayList l1=new ArrayList(5);
      l1.add("ram");
      l1.add(1);
      l1.add(0,"Ashish");
      l1.add(2);
      l1.add(10+11);
     // l1.add((l1.get(2))+(l1.get(3)));
      Iterator it=l1.iterator();
      while(it.hasNext())
          System.out.println(it.next());
    }
}
