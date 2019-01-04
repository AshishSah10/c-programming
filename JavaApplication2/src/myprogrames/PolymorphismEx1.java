package myprogrames;

public class PolymorphismEx1 
{
    public static void main(String[]args)
    {
        TwoWheller v1=new TwoWheller(201,"TN74 12345",2);
        ThreeWheller v2=new ThreeWheller(205,"TN74 54321",3);
        FourWheller v3=new FourWheller(210,"TN74 456777",4);
        v1.display();
        v2.display();
        v3.display();
        System.out.println("");
         System.out.println("By ASHISH KUMAR SAH");
    }
}
class Vehicle
{
    int mod;
    String regno;
   Vehicle(int mod,String regno)
   {
     this.mod=mod;
     this.regno=regno;
   }
   void display()
   {
       System.out.println("model no: "+mod+" Registration No: "+regno);
   }
}
class TwoWheller extends Vehicle
{
    int n;
    TwoWheller(int mod,String regno,int n)
            {
            super(mod,regno);       
            this.n=n;
            }
    void display()
    {
      System.out.println("TWO WHELLER:");
      super.display();
      System.out.println("No. of wheel "+n);
    }
} 
class ThreeWheller extends Vehicle
{
    int n;
    ThreeWheller(int mod,String regno,int n)
            {
            super(mod,regno);       
            this.n=n;
            }
    void display()
    {
      System.out.println("THREE WHELLER:");
      super.display();
      System.out.println("No. of wheel "+n);
    }
} 
class FourWheller extends Vehicle
{
    int n;
    FourWheller(int mod,String regno,int n)
            {
            super(mod,regno);       
            this.n=n;
            }
    void display()
    {
      System.out.println("FOUR WHELLER:");
      super.display();
      System.out.println("No. of wheel "+n);
    }
} 
