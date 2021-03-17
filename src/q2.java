import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iSum=0;
		while(iNum>0)
		{
			int a=iNum%10;
		    iSum+=a;
		    iNum=iNum/10;
		}
		System.out.println(iSum);

	}

}
