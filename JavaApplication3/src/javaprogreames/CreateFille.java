package javaprogreames;
import java.io.*;

public class CreateFille
{
       public static void main(String[]args)throws IOException
       {
           File f1=new File("D:\\CSE LECTURE\\JAVA\\java2");
           File f2=new File("D:\\CSE LECTURE\\JAVA\\java2");
           f1.createNewFile();
           System.out.println("Is exist: "+f1.exists());
           System.out.println("can read: "+f1.canRead());
           System.out.println("length: "+f1.length());
           System.out.println("can write: "+f1.canWrite());
           System.out.println("name: "+f1.getName());
           System.out.println(f1.renameTo(f2));
       }
}
