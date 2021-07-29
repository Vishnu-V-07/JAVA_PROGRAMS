package Strings;
import java.util.*;
public class PalindromePresentInALineOrNot {
    public static boolean isCheck(String s2)
    {
       StringBuffer sb=new StringBuffer(s2);
	   sb.reverse();
	   if(s2.equals(String.valueOf(sb)))
	   {
	      return true;
	   }
	   return false;
    }
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String s1=sc.nextLine();
	   String sarr[]=s1.split(" ");
	   int count=0;
	   for(int i=0;i<sarr.length;i++)
	   {
	       String s2=sarr[i];
	       if(isCheck(s2))
	       {
	           count++;
	       }
	      
	   }
	   if(count>=1)
	   {
	       System.out.println("Present");
	   }
	   else{
	       System.out.println("No");
	   }
	   
	   
	}
}

// I want malayalm movie

// Present
