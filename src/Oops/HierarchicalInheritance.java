package Oops;
import java.util.*;
class Admin{
    String id="1";
    String name="YYY";
    String sName="Vishnu";
    String marks="95";
    void id()
    {
        System.out.println(id);
    }
}
class StaffsName extends Admin
{
    void NameOfStaff()
    {
        System.out.println(name);
    }
}
class Students extends Admin
{
    void StudentName()
    {
        System.out.println(sName);
    }
}
public class HierarchicalInheritance {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Students s1=new Students();
        s1.StudentName();
        StaffsName s2=new StaffsName();
        s2.NameOfStaff();
        s1.id();

    }
    
}
