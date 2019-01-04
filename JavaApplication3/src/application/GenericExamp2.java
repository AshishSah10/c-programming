package application;

public class GenericExamp2 
{
  public static void main(String []args)
  {
   MyData<Integer> o1=new MyData<Integer>();   
   MyData<String> o2=new MyData<String>();
 Integer k=new Integer(5);
 o1.add(5);
 o2.add("Ashish");
 System.out.println("o1= "+o1.get()+" \no2= "+o2.get());
  }
}
class MyData<T>
{
    T i;
    public void add(T i1)
    {
        i=i1;
    }
    public T get()
    {
        return(i);
    }
}
