import java.util.*;
public class SwapFirstLastCharacterofWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String sArr[]=s1.split(" ");
		for(int i=0;i<sArr.length;i++)
		{
			sArr[i]=sArr[i].charAt(sArr[i].length()-1)+sArr[i].substring(1,sArr[i].length()-1)+sArr[i].charAt(0);
		}
		for(int i=0;i<sArr.length;i++)
		{
			System.out.print(sArr[i]+" ");
		}

	}

}
