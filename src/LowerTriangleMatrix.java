import java.util.*;
public class LowerTriangleMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int iR=sc.nextInt();
		int iC=sc.nextInt();
		int iSum=0;
		int iArr[][]=new int[iR][iC];
		int s1=0,s2=0,s3=0,s4=0;
		
		for(int i=0;i<iR;i++)
		{
			for(int j=0;j<iC;j++)
			{
			 iArr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<iR;i++)
		{
			for(int j=0;j<iC;j++)
			{
				if(i>j)
				{
					System.out.print(iArr[i][j]+" ");
				}
			}
		}

	}

}
