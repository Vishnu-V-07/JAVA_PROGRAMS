import java.util.*;
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(s1.charAt(k));
				}
				System.out.println();

			}
			//System.out.println();
		}

	}

}
