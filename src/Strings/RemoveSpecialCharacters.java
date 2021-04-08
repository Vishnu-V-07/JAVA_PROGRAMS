// 10.PROGRAM TO remove punctuation and special character from a string
// Input: $$$helolo)))hi
// Output:helolohi
// Program Name:RemoveSpecialCharacters
package Strings;
import java.util.*;
public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		for(int i=0;i<s1.length();i++) {
			if(Character.isDigit(s1.charAt(i)) || Character.isAlphabetic(s1.charAt(i)))
			{
					System.out.print(s1.charAt(i));
			}
		}

	}

}
