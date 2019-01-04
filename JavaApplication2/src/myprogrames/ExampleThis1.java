package myprogrames;

public class ExampleThis1 
{
 public static void main(String []args)
 {
  Box b1=new Box();
  b1.setDimension(10,6,3);
  System.out.println("length= "+b1.l+"  breadth= "+b1.b+"  height= "+b1.h);
  System.out.println("");
  System.out.println("By ASHISH KUMAR SAH");
 }
}
class Box
{
    int l,b,h;
    public void  setDimension(int l,int b,int h)
    {
        this.l=l;this.b=b;this.h=h;
    }
}
