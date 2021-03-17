import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iArr[]=new int[iNum];
		int iCount=0;
		for(int i=0;i<iNum;i++)
		{
			iArr[i]=sc.nextInt();
		}
		Arrays.sort(iArr);
		for(int i=0;i<iNum;i++)
		{
			for(int j=i+1;j<iNum;j++)
			{
				if(iArr[i]==iArr[j])
				{
					iCount++;
				}
			}
			if(iCount==0)
			{
				System.out.println(iArr[i]);
			}
			if(iCount==1)
			{
				System.out.println(iArr[i]);
				break;
			}
		}
	}

}
