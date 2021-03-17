package Nterm;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int n=iNum;
		int iSum=0;
		while(n>0)
		{
			int rem=n%10;
			iSum=iSum*10+rem;
			n=n/10;
		}
		if(iSum==iNum)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
		

	}

}
