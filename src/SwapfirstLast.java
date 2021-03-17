import java.util.*;
public class SwapfirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		//double d=iNum;
		
		int iCount=(int)(Math.log10(iNum)+1);
		
		int iArr[]=new int[iCount];
        for(int i=iCount-1;i>=0;i--)
        {
        	iArr[i]=iNum%10;
        	iNum=iNum/10;
        }
		int temp=iArr[0];
		iArr[0]=iArr[iCount-1];
		iArr[iCount-1]=temp;
		for(int i=0;i<iCount;i++)
		{
			System.out.print(iArr[i]);
		}


		

		

	}

}
