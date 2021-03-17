package Nterm;
import java.util.*;
public class divisors {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int iNum=sc.nextInt();
    for(int i=1;i<=iNum;i++)
    {
    	if(iNum%i==0)
    	{
    		System.out.print(i+" ");
    	}
    }
	}

}
