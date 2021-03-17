import java.math.BigInteger;
import java.util.*;
public class FactorialOfANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		BigInteger fact= new BigInteger("1");
		Long iNum=sc.nextLong();
		if(iNum>0)
		{
			for(long i=1;i<=iNum;i++)
			{
			   fact=fact.multiply(new BigInteger(Integer.toString((int)i)));
			   
			}
			System.out.println(fact);
		}
		else {
			System.out.println("Invalid Input");
		}
	//	System.out.println(fact);

	}

}
