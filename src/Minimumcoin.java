import java.util.*;
public class Minimumcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int C1=0,C2=0,C5=(iNum-5)/5;
		int rem=0,res=0;
		rem=iNum-(C5*5);
		if(rem%2==0)
		{
			C1=2;
		}
		else {
			C1=1;
		}
		res=C1+C5;
		res+=(rem - C1)/2;
		System.out.println(res);
	}

}
