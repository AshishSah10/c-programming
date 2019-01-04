package application;
import java.util.*;

public class TreeSet1 
{
  public static void main(String[]args)
  {
      TreeSet t=new TreeSet();          //here,tree is BST
      t.add("B");
      t.add("D");
      t.add("C");
      t.add("A");
      System.out.println(t);            //inorder traversing of binary search tree
      System.out.println(t.first());
      System.out.println(t.last());
      System.out.println(t);
      System.out.println(t.headSet("c"));
      System.out.println(t.headSet("C"));
      System.out.println(t.tailSet("C"));
      System.out.println(t.subSet("B","D"));
      System.out.println(t.comparator());
  }
}
