import java.util.*;
public class Subset {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int iNum=sc.nextInt();
     int sNum=sc.nextInt();
     int iArr[]=new int[iNum];
     int sArr[]=new int[sNum];
     for(int i=0;i<iNum;i++)
     {
    	 iArr[i]=sc.nextInt();
     }
     for(int i=0;i<sNum;i++)
     {
    	 sArr[i]=sc.nextInt();
     }
     int iCount=0;
     for(int i=0;i<iArr.length;i++) {
    	 for(int j=0;j<sArr.length;j++)
    	 {
    		 if(iArr[i]==sArr[j])
    		 {
    			 iCount++;
    		 }
    	 }
     }
     if(iCount==sArr.length)
     {
    	 System.out.println("It is a Subset");
     }
     else {
    	 System.out.println("It is not a Subset");
     }
	}

}
