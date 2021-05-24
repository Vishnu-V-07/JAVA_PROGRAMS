package Strings;
import java.util.*;
public class Date1 {

    public static void DateDiff(String s1,String s2)
    {
        String arr1[]=s1.split("-");
        String arr2[]=s2.split("-");
        int day=0;int month=0;int year=0;
        for(int i=0;i<arr1.length;i++)
        {
            day=Integer.parseInt(arr2[i])-Integer.parseInt(arr1[i]);
            month=Integer.parseInt(arr2[i+1])-Integer.parseInt(arr1[i+1]);
            year=Integer.parseInt(arr2[i+2])-Integer.parseInt(arr1[i+2]);
            break;

        }
        System.out.println("days :"+day);
        System.out.println("month :"+month);
        System.out.println("year :"+year);
        int td=day+(month*30)+(year*365);
        System.out.println("TotalDays: "+td);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        DateDiff(s1,s2);
    }
}
