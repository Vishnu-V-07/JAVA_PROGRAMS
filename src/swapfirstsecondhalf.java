import java.util.*;
public class swapfirstsecondhalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iArr[]=new int[iNum];
		for(int i=0;i<iNum;i++)
		{
			iArr[i]=sc.nextInt();
		}
		if(iNum%2==0)
		{
		for(int i=0;i<iNum/2;i++)
		{
			int temp=iArr[i];
			iArr[i]=iArr[i+(iNum/2)];
			iArr[i+(iNum/2)]=temp;
		}
		}
		else {
			for(int i=0;i<iNum/2;i++)
			{
				int temp=iArr[i];

				iArr[i]=iArr[i+((iNum/2)+1)];
			    iArr[i+((iNum/2)+1)]=temp;

				
				
			}

			

		}
		for(int i=0;i<iNum;i++)
		{
			System.out.print(iArr[i]+" ");
		}


	}

}
