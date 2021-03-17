import java.util.*;
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		for(int i=0;i<iNum;i++)
		{
			for(int j=0;j<iNum;j++)
			{
				if(i==j || i+j==iNum-1 || i==0 || i==iNum-1 || j==0 || j==iNum-1  )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
