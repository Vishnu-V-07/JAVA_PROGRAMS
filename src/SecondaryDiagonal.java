import java.util.*;
public class SecondaryDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iSum=0;
		int iArr[][]=new int[iNum][iNum];
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
        		if(i+j==iNum-1)
        		{
        			iSum+=iArr[i][j];
        		}
        	}
        }
        System.out.print(iSum);
        


	}

}
