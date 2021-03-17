package reverse;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iTable=sc.nextInt();
		int iRes=0;
		for(int i=iNum;i>0;i--)
		{
			iRes=i*iTable;
			
			System.out.println(i+"*"+iTable+"="+iRes);
		}
		
	}

}
