import java.util.*;
public class Transverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
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
			    System.out.print(iArr[j][i]+" ");
			}
			System.out.println();
		}

	}

}
