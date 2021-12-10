package Oops;





class Teacher{

    public void display()
    {
        System.out.println("I am a Teacher");
    }
}
class Student extends Teacher
{
    public void display()
    {
        System.out.println("I am a Student");
    }
    public void printMessage()
    {
        display();
        super.display();
    }
}
public class SuperClassMethod {

    public static void main(String args[])
    {
        Student std=new Student();
        std.printMessage();
    }
    
}

/*
OUTPUT

I am a Student

I am a Teacher


*/
