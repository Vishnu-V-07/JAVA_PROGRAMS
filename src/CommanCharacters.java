import java.util.*;
public class CommanCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		ArrayList<Character> al=new ArrayList<>();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j))
				{
					al.add(s1.charAt(i));
				}
			}
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++)
		{		
			System.out.print(al.get(i)+" ");
		}

	}

}
