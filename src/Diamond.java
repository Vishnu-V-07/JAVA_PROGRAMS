import java.util.*;
public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int a=iNum;
		for(int i=0;i<iNum;i++)
		{
			char temp='A';
			for(int j=a;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(temp);
				temp++;
			}
			System.out.println();
			a--;
			
		}
        for(int i=iNum;i>=1;i--)
        {
        	int k=iNum+3;
        	for(int j=i;j>=1;j--)
        	{
        		System.out.print(k);
        		k=k-2;
        	}
        	System.out.println();
        }
	}

}
