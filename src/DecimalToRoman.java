import java.util.*;
public class DecimalToRoman {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		String s3="";
		while(iNum>0)
		{
			if(iNum>=10)
			{
				s3+="X";
				iNum-=10;
			}
			else if(iNum>=9)
			{
				s3+="IX";
				iNum-=9;
			}
			else if(iNum>=5)
			{
				s3+="V";
				iNum-=5;
			}
			else if(iNum>=4)
			{
				s3+="IV";
				iNum-=4;
			}
			else
			{
				s3+="I";
				iNum-=1;
			}
		}
		System.out.println(s3);

	}

}


// 24
// XXIV

// 36
// XXXVI
