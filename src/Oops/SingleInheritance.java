package Oops;
import java.util.*;
class Staffs{
String s3="Vishnu";
void showName()
{
    System.out.println(s3);
     
}
}
class Student extends Staffs{
    void showMarks()
    {
        System.out.println(s3+" you secure 95 marks");
    }
}
public class SingleInheritance {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        s1.showName();
        s1.showMarks();
    }
}
