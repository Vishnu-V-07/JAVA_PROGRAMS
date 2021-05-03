
// String Name Problem
// PROBLEM STATEMENT:

// Given a comma seperated input of two full name A and B,return a new name C, the first name of C=the last name of B and the last name of c=the first name of A with the letters reversed.

// INPUT:         

// tim mary,scott grey                        

// OUTPUT:

// grey mit
package Strings;
import java.util.*;
public class Name {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String sarr[]=s1.split(",");
        String arr2[]=sarr[0].split(" ");
        String arr3[]=sarr[1].split(" ");
        StringBuilder sb=new StringBuilder(arr2[0]);
        sb.reverse();
        System.out.println(arr3[1]+" "+sb);

        
        
    }
}
