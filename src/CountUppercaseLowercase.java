import java.util.*;
public class CountUppercaseLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int c1=0,c2=0,c3=0,c4=0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isUpperCase(s1.charAt(i)))
			{
				c1++;
			}
			if(Character.isLowerCase(s1.charAt(i)))
			{
				c2++;
			}
			if(!(Character.isLetterOrDigit(s1.charAt(i))))
			{
				c3++;
			}
			if((s1.charAt(i)=='a') || (s1.charAt(i)=='e') || (s1.charAt(i)=='i')|| (s1.charAt(i)=='o') ||
					(s1.charAt(i)=='u') || (s1.charAt(i)=='A') || (s1.charAt(i)=='E') || (s1.charAt(i)=='I')|| (s1.charAt(i)=='O') ||
					(s1.charAt(i)=='U') )
					{
						c4++;
					}
			
		}
		System.out.println("Number of uppercase letter : "+c1);
		System.out.println("Number of lowercase letter : "+c2);
		System.out.println("Number of Special characters : "+c3);
		System.out.println("Number of  vowels : "+c4);

	}

}
