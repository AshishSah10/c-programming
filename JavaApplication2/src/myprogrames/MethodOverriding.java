package myprogrames;

public class MethodOverriding 
{
	public static void main(String[] args)
        {
         Drived obj2=new Drived();
	  obj2.fun();
          System.out.println("");
          System.out.println("By ASHISH KUMAR SAH");
	}
   }
	class Base
	{ 
            void fun()
		{
		int a=10,b=30,c=a+b;
	        System.out.println(""+c);
		}
	}
	class Drived extends Base
	{
		void fun()
		{
			System.out.println("IN DRIVED CLASS");
		}
	}

 

