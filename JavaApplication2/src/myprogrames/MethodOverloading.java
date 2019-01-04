package myprogrames;

public class MethodOverloading
{

	public static void main(String[] args)
        {
	Overload obj=new Overload();
	obj.addition(10,20);
	obj.addition(6.7,7.4);
	obj.addition("ASHISH","SAH");
        System.out.println("");
          System.out.println("By ASHISH KUMAR SAH");
	}
}
class Overload
{
	void addition(int a,int b)
	{
            int c=a+b;
		System.out.println("sum of "+a+" and "+b+" is "+c);
	}
void addition(double a,double b)
{
	double c=a+b;
	System.out.println("sum of "+a+" and "+b+" is "+c);
}
void addition(String a,String b)
{System.out.println(a+" "+b);}
}