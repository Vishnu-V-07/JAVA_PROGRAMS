import java.util.*;
public class String16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iCount=0;
		int iArr[][]=new int[iNum][iNum];
		int iA[][]=new int[iNum][iNum];

		for(int i=0;i<iNum;i++)
		{
			for(int j=0;j<iNum;j++)
			{
			 iArr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<iNum;i++)
		{
			for(int j=0;j<iNum;j++)
			{
			 iA[i][j]=iArr[j][i];
			}
		}
		for(int i=0;i<iNum;i++)
		{
			for(int j=0;j<iNum;j++)
			{
			  if(iA[i][j]!=iArr[i][j])
			  {
				  iCount=1;
			  }
			}
		}
		if(iCount==1)
		{
			System.out.println(" Non Symmetric");
		}
		else {
			System.out.println("Symmetric");
		}



	}

}
