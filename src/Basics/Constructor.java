package Basics;

/*
  modifier ClassName()
  {
      //body of the constructor;
  }
*/

public class Constructor{


    String name;
    public Constructor(){
       System.out.println("Constructor is called");
        name="Java Constructor";
    }
    public static void main(String args[])
    {
        Constructor obj=new Constructor();
        System.out.println("Constructor name is "+obj.name);
    }
}

/* OUTPUT
Constructor is called
Constructor name is Java Constructor
*/