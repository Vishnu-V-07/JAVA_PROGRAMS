import java.util.*;
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char cArr[]=s1.toCharArray();
		char c[]=new char[cArr.length];
		int iNum=0;
		for(int i=0;i<s1.length();i++)
		{
			iNum=0;
			for(int j=i;j<s1.length();j++)
			{
				if(cArr[i]==cArr[j])
				{
					iNum++;
				}
			}
			if(cArr[i]==' ')
			{
				c[i]=' ';
			}
			if(iNum==1)
			{
				c[i]=cArr[i];
			}
		}
		String s3=new String(c);
		System.out.println(s3);
		

	}

}
