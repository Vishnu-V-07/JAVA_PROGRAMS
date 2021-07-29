package Patterns;
import java.util.*;
public class Fourquadrantpattern {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int iNum=sc.nextInt();
	    for(int i=1;i<=iNum;i++)
	    {
	        int c=65;
	        for(int j=1;j<=iNum-i;j++)
	        {
	            System.out.print("  ");
	        }
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print((char)c+" ");
	            c++;
	        }
	        int k=iNum;
	        for(int j=iNum;j>=i;j--)
	        {
	            System.out.print(k+" ");
	            k--;
	        }
	            System.out.println();
	    }
	    int d=iNum;
	    for(int i=1;i<=iNum;i++)
	    {
	        int k=i;
	        for(int j=iNum;j>=i;j--)
	        {
	            System.out.print(k+" ");
	           
	            int c=j+k;
	            k=c;
	        }
	        for(int j=1;j<i;j++)
	        {
	            System.out.print(" ");
	        }
	        int space=(iNum*i)-i-1;
	        for(int j=1;j<space-1;j++)
	        {
	            System.out.print(" ");
	        }
	        
	        int v=65;
	        for(int j=iNum;j>=i;j--)
	        {
	            System.out.print((char)v+" ");
	            v++;
	        }
	        System.out.println();
	    }
	
	}
}


// 4
//       A 4 3 2 1
//     A B 4 3 2
//   A B C 4 3
// A B C D 4
// 1 5 8 10 A B C D
// 2 6 9     A B C
// 3 7         A B
// 4             A

