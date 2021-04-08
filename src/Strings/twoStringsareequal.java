// 18.PROGRAM TO CHECK THE GIVEN TWO STRINGS ARE EQUAL OR NOT
// Input:HELLO
//       HHELLO
// Output: Strings are not equal

// Program Name: twoStringsareequal
package Strings;
import java.util.*;
public class twoStringsareequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}

	}

}
