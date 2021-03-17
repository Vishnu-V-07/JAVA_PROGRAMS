import java.util.*;
public class Sortthedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int iNum=sc.nextInt();
		//double d=iNum;
		
		int iCount=(int)(Math.log10(iNum))+1;
		int iArr[]=new int[iCount];
		int i=iCount-1;
		while(iNum>0 && i>=0)
		{
        	iArr[i]=iNum%10;
        	iNum=iNum/10;
        	i--;

		}

        Arrays.sort(iArr);
		for(int j=0;j<iCount;j++)
		{
			System.out.print(iArr[j]);
		}


	}

}
