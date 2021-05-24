package Arrays;
import java.util.*;
public class InsertTwoSortedArray {

    public static void toInsert(int iArr[],int iArr2[],int iNum)
    {
        int len=iArr.length+iArr2.length;
        int iArr3[]=new int[len];
        int a=0,i=0,j=0;
       while(i<iNum && j<iNum)
       {
           if(iArr[i]<iArr2[j])
           {
               iArr3[a]=iArr[i];
               i++;
               a++;
           }
           else{
               iArr3[a]=iArr2[j];
               j++;
               a++;
           }

       }
     //  System.out.println(i+" "+j);
       while(i<iNum)
       {
           iArr3[a]=iArr[i];
           i++;
           a++;
       }
       while(j<iNum)
       {
           iArr3[a]=iArr2[j];
           j++;
           a++;
       }
        System.out.println(Arrays.toString(iArr3));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int iArr[]=new int[iNum];
        int iArr2[]=new int[iNum];
        for(int i=0;i<iNum;i++)
        {
            iArr[i]=sc.nextInt();
        }
        for(int i=0;i<iNum;i++)
        {
            iArr2[i]=sc.nextInt();
        }
        toInsert(iArr,iArr2,iNum);
    }
    
}

// 5
// 1 3 5 7 9
// 2 4 6 8 10

// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]