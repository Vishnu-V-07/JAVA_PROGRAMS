import java.util.*;
public class PrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
;
		int iNum=sc.nextInt();
		int iEnd=sc.nextInt();
	    int count=0;
		for(int i=iNum;i<=iEnd;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
	}

}
