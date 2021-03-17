import java.util.*;
public class Extraspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s3="";
		int iCount=0;
		for(int i=0;i<s1.length();i++)
		{
			//s3+=sArr[i];
			if(s1.charAt(i) !=' ')
			{
				//s3+=s1.charAt(i);
				if(iCount>0)
				{
					System.out.print(" ");
					iCount=0;
				}
				System.out.print(s1.charAt(i));
			}
			else
			{
				iCount++;
			}
		}
		

	}

}
