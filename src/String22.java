import java.util.*;
public class String22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char c1[]=s1.toCharArray();
		char c2[]=new char[c1.length];
		int iCount=0;
		for(int i=0;i<s1.length();i++)
		{
			iCount=0;
			for(int j=0;j<s1.length();j++) {
				if(c1[i]==c1[j])
				{
					iCount++;


				}
			}
			if(iCount>1)
			{
				c2[i]=Character.toUpperCase(c1[i]);
			}
			else {
			c2[i]=c1[i];
			}
		}
		String s2=new String(c2);
		
		System.out.print(s2);


	}

}
