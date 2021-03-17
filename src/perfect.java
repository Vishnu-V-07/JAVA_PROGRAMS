import java.util.*;
public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int sum=0;
		int a=iNum;
		for(int i=1;i<iNum;i++)
		{
			if(iNum%i==0)
			{
				sum+=i;
			}
		}
		if(sum==a)
		{
			System.out.println("Perfect");
		}
		else {
			System.out.println("Not Perfect");
		}

	}

}
