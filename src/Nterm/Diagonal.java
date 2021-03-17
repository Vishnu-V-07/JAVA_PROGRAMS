package Nterm;
import java.util.*;
public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		for(int i=1;i<=iNum;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
