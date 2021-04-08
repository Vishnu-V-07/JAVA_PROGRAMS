//Java Program to capitalize each word in String
package Strings;

import java.util.*;
public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		sc.close();
		String sArr[]=s1.split(" ");
		for(int i=0;i<sArr.length;i++)
		{
			if(Character.isLowerCase(sArr[i].charAt(0)))
			{
				sArr[i]=Character.toUpperCase(sArr[i].charAt(0))+sArr[i].substring(1,sArr[i].length());
			}
		}
		for(String s3:sArr)
		{
			System.out.println(s3+" ");
		}

	}

}

// #AnotherMethod
	
// public class StringFormatter {  
// 	public static String capitalizeWord(String str){  
// 		String words[]=str.split("\\s");  
// 		String capitalizeWord="";  
// 		for(String w:words){  
// 			String first=w.substring(0,1);  
// 			String afterfirst=w.substring(1);  
// 			capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
// 		}  
// 		return capitalizeWord.trim();  
// 	}  
// 	}  
	
	
// 	public class TestStringFormatter {  
// 	public static void main(String[] args) {  
// 		System.out.println(StringFormatter.capitalizeWord("my name is khan"));  
// 		System.out.println(StringFormatter.capitalizeWord("I am sonoo jaiswal"));  
// 		}  
// 	}  
// 	Output:
	
// 	My Name Is Khan
// 	I Am Sonoo Jaiswal
