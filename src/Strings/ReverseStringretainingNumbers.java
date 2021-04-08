// 15.program to  reverse the sentence without reversing the numbers in a string
// Input:hello123java
// Output:avajo123lleh
// Program Name:ReverseStringretainingNumbers
package Strings;
import java.util.Scanner;

public class ReverseStringretainingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char c1[]=s1.toCharArray();
		int iNum=c1.length-1,il=0;
		while(il<iNum)
		{
			if(!(Character.isAlphabetic(c1[il])))
			{
				il++;
			}
			else if(!(Character.isAlphabetic(c1[iNum])))
			{
				iNum--;
			}
			else {
				char temp=c1[il];
				c1[il]=c1[iNum];
				c1[iNum]=temp;
				il++;
				iNum--;
			}
		}
		String s2=new String(c1);
		System.out.println(s2);
	}

}
