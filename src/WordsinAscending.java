import java.util.*;
public class WordsinAscending {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int iNum=sc.nextInt();
		 String sArr[]=new String[iNum];
		 String sArr2[]=new String[iNum];

		 
		 for(int i=0;i<iNum;i++)
		 {
			 sArr[i]=sc.next();
		 }
		 for(int i=0;i<sArr.length;i++)
		 {
			 for(int j=i+1;j<sArr.length;j++)
			 {
				 if(!(sArr[i]==sArr[j]))
				 {
					 sArr2[i]+=sArr[i];
				 }
			 }
		 }
		 Arrays.sort(sArr2);
		 System.out.println(Arrays.toString(sArr2));
	}

}
