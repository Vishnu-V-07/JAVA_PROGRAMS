package Oops;


class Bird
{
    public void display()
    {
        System.out.println("I am a Bird");
    }
}
class Parrot extends Bird
{
    public void display()
    {
        System.out.println("I am a Parrot");
    }
}
public class methodoveriding
{
    public static void main(String args[])
    {
        Parrot p1=new Parrot();
        p1.display();
    }
}

/*
OUTPUT

I am a Parrot

*/