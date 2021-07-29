package Oops;
import java.util.*;
public class staticvariablemethods {
    static int a=10;
    static int b=20;
  
    static void add(int a,int b)
    {
        System.out.println(a);
        System.out.println(a+b);
    }
    static{
        a=a+10;
    }

  
    public static void main(String args[])
    {
      add(a,b);
    }
}
