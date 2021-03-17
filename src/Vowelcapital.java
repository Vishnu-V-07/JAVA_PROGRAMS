import java.util.*;
public class Vowelcapital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		for(int i=0;i<s1.length();i++)
		{
			switch(s1.charAt(i))
			{
			case 'a':
				s1=s1.replace('a', 'A');
				break;
			case 'e':
				s1=s1.replace('e', 'E');
				break;
			case 'i':
				s1=s1.replace('i', 'I');
				break;
			case 'o':
				s1=s1.replace('o', 'O');
				break;
			case 'u':
				s1=s1.replace('u', 'U');
				break;
			}

		}
		System.out.println(s1);

	}

}
