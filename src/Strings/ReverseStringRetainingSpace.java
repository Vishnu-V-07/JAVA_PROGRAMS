// 17.program to  reverse the sentence  retaining its space position
// Input:HI HELLO
// Output: OL LEHIH
// Program Name:ReverseStringRetainingSpace
package Strings;
import java.util.*;
public class ReverseStringRetainingSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		sc.close();
		char c1[]=s1.toCharArray();
		char c2[]=new char[c1.length];
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]==' ')
			{
				c2[i]=' ';
			}
		}
		int j=c2.length-1;
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=' ')
			{
				if(c2[j]==' ')
				{
					j--;
				}
				c2[j]=c1[i];
				j--;
			}
			
		}
		System.out.println(String.valueOf(c2));		

	}

}
