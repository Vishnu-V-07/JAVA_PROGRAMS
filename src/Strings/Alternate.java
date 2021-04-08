// 9.PROGRAM TO PRINT ALTERNATE CHARACTERS

// Input:hello
// output:hlo
package Strings;
import java.util.*;
public class Alternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		for(int i=0;i<s1.length();i=i+2)
		{
			System.out.print(s1.charAt(i));
		}
	}

}
