package studentinfo;
import studentinfo1.Student;

public class Example1 
{
public static void main(String[] args) 
{
		 int r;
       Student s1=new Student();
       s1.setRollno(12345);
       s1.setName("ASHISH");
       System.out.println("Roll no: "+s1.getRollno());
       System.out.println("NAME: "+s1.getName());
}  
}
