import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iN1=1;
		int iN2=1;
		int iSum=0;
		for(int i=2;i<=iNum;i++)
		{
			iSum=iN1+iN2;
			iN1=iN2;
			iN2=iSum;
		}
		System.out.println(iSum);
		

	}

}
