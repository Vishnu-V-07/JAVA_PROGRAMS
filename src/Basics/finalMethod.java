package Basics;



 class Final
{
  public final void display()
  {
      System.out.println("This is a final method");
  }
}
public class finalMethod extends Final
{
    /* Cannot be override */

    public final void display()
    {
        System.out.println("final method cannot be overridden");
    }
    //*/
    public static void main(String args[])
    {
        finalMethod obj=new finalMethod();
        obj.display();
    }
}

/*
OUTPUT

error

*/
