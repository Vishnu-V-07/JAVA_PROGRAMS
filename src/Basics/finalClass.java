package Basics;

final class FinalClass
{
    //This is final method
    public void display()
    {
        System.out.println("Hello Java");
    }

}
//Here we ty to extend final class
class finalClass extends FinalClass
{
    public void display()
    {
        System.out.println("Hello World");
    }
    public static void main(String args[])
    {
        finalClass obj=new finalClass();
        obj.display();
    }
}