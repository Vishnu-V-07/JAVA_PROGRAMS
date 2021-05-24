package Oops;
import java.util.*;
class SimpleCalc{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
public class CompileTimePolymorphism {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        SimpleCalc a=new SimpleCalc();
        a.add(10,20);
        a.add(10,20,30);
    }
    
}
