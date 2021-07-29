package Zoho_Interview_questions;
import java.util.*;
public class Permutation
{
    public static String swap(String s1,int i,int j)
    {
        char temp;
        char[] arr=s1.toCharArray();
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return String.valueOf(arr);
    }
    public static void Permute(String s1,int s,int e)
    {
        if(s==e)
        {
            System.out.println(s1);
        }
        else{
            for(int i=s;i<=e;i++)
            {
                s1=swap(s1,s,i);
                Permute(s1,s+1,e);
                s1=swap(s1,s,i);
                
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        Permute(s1,0,s1.length()-1);
    }
}


// ABC

// ABC
// ACB
// BAC
// BCA
// CBA
// CAB