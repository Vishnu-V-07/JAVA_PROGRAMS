package Oops;
public class thisKeyword
{
    String name;
    public void displayName(String name)
    {
        this.name=name;
    }

    public static void main(String args[])
    {
        thisKeyword obj=new thisKeyword();
        obj.displayName("Vishnu");
        System.out.println("The name is "+obj.name);
    }
}

/*
OUTPUT:

The name is Vishnu

*/