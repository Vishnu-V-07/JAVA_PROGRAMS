import java.util.*;
public class ProductOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int product=1;
		while(iNum>0)
		{
			int rem=iNum%10;
			product*=rem;
			iNum/=10;
		}
		System.out.print(product);
		

	}

}
