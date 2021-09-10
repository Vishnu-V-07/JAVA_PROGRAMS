package Arrays;
import java.util.*;
public class MergeSortarray {

    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3="";
        String s4="";
        
        ArrayList<Integer> al3=new ArrayList<>();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='[' || s1.charAt(i)==']')
            {
                continue;
            }
            else{
                s3+=String.valueOf(s1.charAt(i));
               
            }
        }
        String arr[]=s3.split(",");
         for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='[' || s2.charAt(i)==']')
            {
                continue;
            }
            else{
                s4+=String.valueOf(s2.charAt(i));
                
            }
           
        }
        String arr2[]=s4.split(",");
        
        
       
        for(int i=0;i<arr.length;i++)
        {
            al3.add(Integer.parseInt(arr[i]));
            
           

        }
         for(int i=0;i<arr2.length;i++)
        {
            al3.add(Integer.parseInt(arr2[i]));
        }
       
        Collections.sort(al3);
        System.out.println(al3);

    }
    
}

  //  Write a program to merge two given array and sort that array in ascending order

  //i/p:

  //[4,89,12,56,2,8]

  //[23,5,7,9,1]

 //o/p
  // [1,2,4,5,7,8,9,12,23,56,89]
