import java.util.*;
public class String21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char c1=sc.next().charAt(0);
		char sArr[]=s1.toCharArray();
		for(int i=1;i<sArr.length;i++)
		{
			
			if(sArr[i]==c1)
			{
				sArr[i]='$';
			}
		}
		String s2=new String(sArr);
		System.out.print(s2);


		}

}
