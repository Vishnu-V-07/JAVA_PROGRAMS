package Oops;
import java.util.*;
class AdminPage{
    String name="YYY";
    String sName="Vishnu";
    String marks="95";
    void staffname()
    {
        System.out.println(name);
    }
}
class Staff extends AdminPage{
    void showName()
    {
        System.out.println(sName);
    }
}
class StudentName extends Staff{
    void showMarks()
    {
        System.out.println(marks);
    }

   
}
public class MultiLevelInheritance {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StudentName s1=new StudentName();
        s1.showName();
        s1.showMarks();
        s1.staffname();
       
    }
    
}
