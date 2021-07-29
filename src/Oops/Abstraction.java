package Oops;
import java.util.*;
abstract class AdminDetails{

    String  A_Name="ZZZ";
    public abstract void StudentDetails();

    public void Admin()
    {
        System.out.println("The Name of Admin is "+A_Name);
    }

}
class Members extends AdminDetails{
    public void StudentDetails()
    {
        System.out.println("Member A belongs to the Admin ");
    }

}
public class Abstraction {
    
    public static void main(String args[])
    {
        Members s1=new Members();
        s1.Admin();
        s1.StudentDetails();

    }
}
