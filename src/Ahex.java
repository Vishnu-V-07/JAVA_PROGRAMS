import java.util.*;
public class Ahex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iArr[]=new int[8];
		for(int i=0;i<8;i++)
		{
			iArr[i]=sc.nextInt();
		}
			int j=3;
			int a2[]=new int[2];
			for(int k=0;k<4;k++)
			{
				a2[0]+=iArr[k]*Math.pow(2, j);
				j--;
			}
			j=3;
			for(int k=4;k<8;k++)
			{
				a2[1]+=iArr[k]*Math.pow(2, j);
				j--;
			}
			System.out.print("0x");
			for(int k=0;k<2;k++)
			{
				switch(a2[k])
				{
				case 10:
					System.out.print("A");
					break;
				case 11:
					System.out.print("B");
					break;
				case 12:
					System.out.print("C");
					break;
				case 13:
					System.out.print("D");
					break;
				case 14:
					System.out.print("E");
					break;
				case 15:
					System.out.print("F");
					break;
				default:
					System.out.print(a2[k]);
				}
			}
		}
	}


