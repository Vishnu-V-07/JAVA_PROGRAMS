import java.util.*;
public class SwapFirstAndLastWithoutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in );
		int iNum=sc.nextInt();
		int iC=(int)(Math.log10(iNum)+1);
		int iL=iNum%10;
		int f=(int)(iNum/(Math.pow(10,iC-1)));
		int m=(int)(iNum%Math.pow(10, iC-1));
		int res=(int)(iL*Math.pow(10, iC-1))+(m/10)*10+f;
		System.out.println(res);
	}

}
