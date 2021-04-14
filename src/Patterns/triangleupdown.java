package Patterns;
import java.util.*;
public class triangleupdown {
public static void main(String args[])
{    Scanner sc=new Scanner(System.in);
    int iNum=sc.nextInt();
    int k=1;
    for(int i=0;i<iNum;i++)
    {
       for(int j=0;j<=i;j++)
       {
           if(k==1)
           {
           System.out.print(k+" ");
           k++;
           }
           else if(j==i){
            System.out.print(k+" ");
            k++; 
           }
           else{
            System.out.print(k+"*");
            k++; 
           }
        }
        System.out.println();
       }
       int l=k-1;
       double d=0;
       for(int i=iNum;i>0;i--)
    {
       for(int j=1;j<=i;j++)
       {
           if(l==1)
           {
           System.out.print(l+" ");
           l++;
           }
           else if(j==i){
            System.out.print(l-(iNum-1)+" ");
            d=l-(2*(i-1)); 
            l=(int)d;
           }
           else{
            System.out.print(l-(iNum-1)+"*");
            l++; 
           }
        }
        System.out.println();
       }
       

    
    }
    
}

