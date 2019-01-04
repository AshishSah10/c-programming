package javaprogreames;
import javax.swing.*;

public class ExampleJframe2 extends JFrame
{
    ExampleJframe2(){}
     ExampleJframe2(String s){
        super(s);
    }
   public static void main(String[]args)
   {
     ExampleJframe2 jf=new ExampleJframe2("SWING EXAMPLE"); 
     jf.setSize(300,300);
      jf.setVisible(true);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
