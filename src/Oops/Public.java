package Oops;

class Bird1
{
    public String name;

    public void display()
    {
        System.out.println("The Bird name is "+name);
    }

}

public class Public {

    public static void main(String args[])
    {
        Bird1 bird=new Bird1();

        bird.name="Eagle";
        bird.display();


    }
    
}
