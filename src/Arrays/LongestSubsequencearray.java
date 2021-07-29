package Arrays;
import java.util.*;
public class LongestSubsequencearray
{
    static int longestSubsequence(int size, int a[])
    {
        Set<Integer> hs=new HashSet<>();
        for(int num:a)
        {
            hs.add(num);
        }
        int longest=0;
        for(int num:a)
        {
            if(!hs.contains(num-1))
            {
                int cn=num;
                int count=1;
                while(hs.contains(cn+1))
                {
                    cn+=1;
                    count+=1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }

  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int iNum=sc.nextInt();
      int arr[]=new int[iNum];
      for(int i=0;i<iNum;i++)
      {
          arr[i]=sc.nextInt();
      }
      System.out.println(longestSubsequence(iNum,arr));
  }
}

// 5
// 1 2 3 6 7

// 3