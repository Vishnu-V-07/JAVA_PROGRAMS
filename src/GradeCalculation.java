import java.util.*;
public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		if(iNum>=91 && iNum<=100)
		{
			System.out.println("O");
		}
		else if(iNum>=81 && iNum<=90)
		{
			System.out.println("A+");
		}
		else if(iNum>=71 && iNum<=80)
		{
			System.out.println("A");
		}
		else if(iNum>=61 && iNum<=70)
		{
			System.out.println("B+");
		}
		else if(iNum>=51 && iNum<=60)
		{
			System.out.println("B");
		}
		else if(iNum>=50)
		{
			System.out.println("Fail");
		}



	}

}
