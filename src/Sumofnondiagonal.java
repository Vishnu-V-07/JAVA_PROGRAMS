import java.util.*;
public class Sumofnondiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				if(i<j && i+j<iR-1)
				{
					s1+=iArr[i][j];
				}
			}
		}
		for(int i=0;i<iR;i++)
		{
			for(int j=0;j<iC;j++)
			{
				if(i<j && i+j>iR-1)
				{
					s2+=iArr[i][j];
				}
			}
		}
		for(int i=0;i<iR;i++)
		{
			for(int j=0;j<iC;j++)
			{
				if(i>j && i+j>iR-1)
				{
					s3+=iArr[i][j];
				}
			}
		}
		for(int i=0;i<iR;i++)
		{
			for(int j=0;j<iC;j++)
			{
				if(i>j && i+j<iR-1)
				{
					s4+=iArr[i][j];
				}
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		
	}

}
