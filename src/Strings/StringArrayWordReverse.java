package Strings;
import java.util.*;
public class StringArrayWordReverse {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();//India is my country
        String sarr[]=s1.split(" ");//sarr[0]=India, sarr[1]=is ,sarr[2]=my ,sarr[3]=country
        for(int i=sarr.length-1;i>=0;i--)
        {
            System.out.print(sarr[i]+" ");//country my is India
        }
    }
}
// India is my country

// country my is India