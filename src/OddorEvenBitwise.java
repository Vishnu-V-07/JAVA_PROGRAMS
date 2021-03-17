import java.util.*;
public class OddorEvenBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		if((iNum&1)==1)
		{
			System.out.print("Odd");
		}
		else {
			System.out.println("Even");
		}

	}

}
