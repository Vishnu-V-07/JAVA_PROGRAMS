package Strings;
import java.util.*;
public class Stringrevspace {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char a1[]=s1.toCharArray();
        char a2[]= new char[a1.length];
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]==' ')
            {
                a2[i]=' ';
            }
        }
        int j=a1.length-1;
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]!=' ')
            {
                if(a2[j]==' ')
                {
                    j--;
                }
                a2[j]=a1[i];
                j--;
            }
        }
        System.out.println(String.valueOf(a2));
    }
    
}
