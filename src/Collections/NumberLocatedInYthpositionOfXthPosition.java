package Collections;
import java.util.*;
public class NumberLocatedInYthpositionOfXthPosition {

    public static void Search(ArrayList<ArrayList<Integer>> line,int iX,int iY)
    {
      try{
          System.out.println(line.get(iX-1).get(iY-1));
      }
      catch(IndexOutOfBoundsException e)
      {
          System.out.println("ERROR");
      }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iT=sc.nextInt();
        ArrayList<ArrayList<Integer>> line=new ArrayList<>();
        for(int i=0;i<iT;i++)
        {
            int iL=sc.nextInt();
            ArrayList<Integer> al=new ArrayList<>();
            for(int j=0;j<iL;j++)
            {
                al.add(sc.nextInt());
            }
            line.add(al);
        }
        int iL2=sc.nextInt();
        for(int i=0;i<iL2;i++)
        {
            int iX=sc.nextInt();
            int iY=sc.nextInt();
            Search(line,iX,iY);
        }
        sc.close();
    }
    
}
// I/P:
// 5
// 5 41 77 74 22 44
// 1 12
// 4 37 34 36 52
// 0
// 3 20 22 33
// 5
// 1 3
// 3 4
// 3 1
// 4 3
// 5 5

// O/P:
// 74
// 52
// 37
// ERROR
// ERROR
