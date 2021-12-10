package Oops;



class Bird
{
    String birdName="KingEagle";
    
}
class Eagle extends Bird{

    public void displayName()
    {
        System.out.println("The bird name is"+birdName);
    }
}
public class Inheritance {

    public static void main(String args[])
    {
        Eagle b=new Eagle();
        b.displayName();
    }
    
}

/*
OUTPUT

The bird name is KingEagle

*/