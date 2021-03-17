import java.util.Scanner;

import java.util.*;
public class MultiplyDivisionWithoutoperator {

	public static void multiply(int n1,int n2)
	{
		int sum=0;
		for(int i=1;i<=n1;i++)
		{
			sum+=n2;
		}
		System.out.println(sum);
	}
	public static void division(int n1,int n2)
	{
		int diff=0;
		while(n1>=n2)
		{
			n1=n1-n2;
			diff++;
		}
		System.out.println(diff);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		multiply(n1,n2);
		division(n1,n2);

	}

}
