package Collections;
import java.util.*;
public class BirthdayTreat {

    public static int eCount(int iArr[][],int e,int a)
    {
        int count=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(e==iArr[i][j])
                {
                    count++;
                }
            }
           
        }
        return count;
    }

    public static void FindFriends(int[][] iArr,int a)
    {
        int b,e,c,sum=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<2;j++)
            {
                b=iArr[i][j];
                if(b==0)
                {
                     e=iArr[i][j+1];
                    c=eCount(iArr,e,a);
                    if(c==1)
                    {
                        sum+=e;
                    }
                }
            }
        }
        System.out.println(sum);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int  iArr[][]=new int[iNum-1][2];
        int a=iNum-1;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<2;j++)
            {
                iArr[i][j]=sc.nextInt();
            }
        }
        FindFriends(iArr,a);

    }
    
}

// 4
// 0 1
// 0 2
// 2 3

// 1



// 0 1
// 0 2

// 3