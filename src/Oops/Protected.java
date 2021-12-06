package Oops;



class Bird2
{
    protected void display()
    {
        System.out.println("The Bird name is pigeon");
    }
}
class Protected extends Bird2
{
    public static void main(String args[])
    {
        Bird2 b2=new Bird2();
        b2.display();
    }
}

/*

OUTPUT

The Bird name is Pigeon

*/