// MAXIMUM UNIQUE LETTERS IN A STRING

// PROBLEM STATEMENT

// Given a String array containing list of names the task is to return
//  a single name from the array which as more unique letters among them.

//  I/P:
//  5
// kylan charles
// raymond strickland
// julissa shepard
// andrea meza
// destiny alvarado

// O/P:
// raymond strickland

package Strings;
import java.util.*;
public class MostUnique {
     static void Unique(String arr[])
     {
         int max=0;
         int len=0;
         String s2="";
         for(int i=0;i<arr.length;i++)
         {
            String s1=arr[i];
            HashSet<Character> hs=new HashSet();
            for(int j=0;j<s1.length();j++)
            {
                hs.add(s1.charAt(j));
                
               
            }
            len=hs.size();
            if(len>max)
            {
                max=len;
                s2=s1;
            }
        }
           System.out.println(s2);
          

         }
     
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        sc.next();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        Unique(arr);
    }
    
}
