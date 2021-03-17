import java.util.*;
public class String23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		ArrayList<Character> ar=new ArrayList<>();
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch)|| Character.isAlphabetic(ch) )
			{
				if(!ar.contains(ch))
				{
					ar.add(ch);
				}
			}
				else {
					ar.add(ch);
				}
		}
			
 		
		for(char c: ar)
		{
		   System.out.print(c);
		}
		

	}

}
