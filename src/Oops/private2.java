package Oops;




class Private1
{
    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
}
public class private2 {
    
    public static void main(String[] args) {
    
    Private1 p1=new Private1();
    p1.setName("Java");
    System.out.println(p1.getName());

    }
}


/*

OUTPUT

Java

*/