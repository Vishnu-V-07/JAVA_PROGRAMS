// 1
// 2
// ABCDE
// Left Shift //1 LEFT SHIFT BCDEA 
// BCDEA //1  right shift ABCDE
         //2  RIGHT SHIFT EABCD
// Right Shift
// EABCD
package Strings;
import java.util.*;
public class ShiftingStrings {
    public static String leftRotate(String s1,int iL)
    {
        String s3="";
        System.out.println("Left Shift");
        s3=s1.substring(iL,s1.length())+s1.substring(0,iL);
        System.out.println(s3);
        return s3;

    }
    public static void RightRotate(String s2,int iR)
    {
        String s4="";
        System.out.println("Right Shift");
       s4=s2.substring(s2.length()-iR)+s2.substring(0,s2.length()-iR); 
        System.out.println(s4);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iL=sc.nextInt();
        int iR=sc.nextInt();
        String s1=sc.next();
      
        String s2=leftRotate(s1,iL);
        RightRotate(s2,iR);
    }
    
}
