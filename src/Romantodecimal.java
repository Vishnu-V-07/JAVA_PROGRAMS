import java.util.*;
public class Romantodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		//char cArr[]=s1.toCharArray();
		int a=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='I' && s1.charAt(i+1)=='V')
			{
				a+=4;
				break;
			}	
			if(s1.charAt(i)=='I' && s1.charAt(i+1)=='X')
			{
				a+=9;
				break;
				
			}

			if(s1.charAt(i)=='X')
			{
				a+=10;
			}
			if(s1.charAt(i)=='V')
			{
				a+=5;
				
			}

			if(s1.charAt(i)=='I')
			{
				  a+=1;
			
			}
		}
		System.out.println(a);
	}

}
