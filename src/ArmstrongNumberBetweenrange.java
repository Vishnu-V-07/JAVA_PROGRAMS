import java.util.*;
public class ArmstrongNumberBetweenrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iStart=sc.nextInt();
		int iEnd=sc.nextInt();
		int iCount=0,iSum=0;
		int b=0;
		for(int i=iStart;i<=iEnd;i++)
		{
			int iC=i;
			iCount=0;
			while(iC>0)
			{
				iC=iC/10;
				iCount++;	
			}
			
			b=i;
			iSum=0;
			while(b>0)
			{
				int iD=b%10;
				double e=Math.pow(iD,iCount);
				iSum=iSum+(int)e;
				b=b/10;				
			}
			if(i==iSum)
			{
				System.out.println(i+" is an armstrong number");
				
			}			
		}

	}

}
