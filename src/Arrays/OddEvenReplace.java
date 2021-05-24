package Arrays;
import java.util.*;
public class OddEvenReplace {

    public static void Replace(int iArr[],int iNum)
    {
        int a=0;
        for(int i=0;i<iNum;i++)
        {
            if(iArr[i]%2!=0)
            {
                iArr[a]=iArr[i];
                a++;
            }
        }
        for(int i=a;i<iNum;i++)
        {
            iArr[i]=-1;
        }
        System.out.println(Arrays.toString(iArr));
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int iArr[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            iArr[i]=sc.nextInt();
        }
        Replace(iArr,iNum);
    }
}
