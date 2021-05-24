package Oops;
import java.util.*;
public class Constructor
{
    String Name;
    int rollnum;
    public Constructor(String Name,int rollnum)
    {
        this.Name=Name;
        this.rollnum=rollnum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Constructor c1=new Constructor("Vishnu",76);
        System.out.println(c1.Name+" "+c1.rollnum);
    }
}