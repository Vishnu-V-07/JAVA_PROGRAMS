import java.util.*;
public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		String sArr[]=s1.split(" ");
		for(int i=0;i<sArr.length;i++)
		{
			if(Character.isLowerCase(sArr[i].charAt(0)))
			{
				sArr[i]=Character.toUpperCase(sArr[i].charAt(0))+sArr[i].substring(1,sArr[i].length());
			}
		}
		for(String s3:sArr)
		{
			System.out.println(s3+" ");
		}

	}

}
