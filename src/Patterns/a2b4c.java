package Patterns;
import java.util.*;
class a2b4c{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        ArrayList<String> al=new ArrayList<>();
        int a=97;
        int b=2;
        for(int i=0;i<iNum;i++)
        {
            if(i%2==0)
            {
                al.add(String.valueOf((char)a));
                a++;
            }
            else{
                al.add((String.valueOf(b)));
                b=b+2;
            }
        }
        for(int i=0;i<iNum;i++)
        {
          for(int j=i;j<iNum;j++)
          {
                System.out.print(al.get(j)+" ");
          }
          System.out.println();
        }
        for(int i=2;i<=iNum;i++)
        {
          for(int j=iNum-i;j<iNum;j++)
          {
          
                System.out.print(al.get(j)+" ");
          }
          System.out.println();
        }
    }
}


// 5

// a 2 b 4 c
// 2 b 4 c
// b 4 c
// 4 c
// c
// 4 c
// b 4 c
// 2 b 4 c
// a 2 b 4 c