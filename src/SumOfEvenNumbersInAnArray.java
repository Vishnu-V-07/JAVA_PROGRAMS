import java.util.*;
public class SumOfEvenNumbersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int flag=0;
		if(iNum>0)
		{
			long iSum=0;
		   long iArr[]=new long[iNum];
			for(int i=0;i<iNum;i++)
			{
				
				iArr[i]=sc.nextLong();
				
			}
			
			for(int i=0;i<iArr.length;i++)
			{
				if(iArr[i]>0)
				{
					if(iArr[i]%2==0)
					{
						iSum+=iArr[i];
					}
				}
				else {
			        flag=1;

				}
			}
			System.out.println(iSum);
		}
		else {
			System.out.println("Invalid Input");
		}
		if(flag>=1)
		{
			System.out.println("Invalid Input");

		}
	}

}
