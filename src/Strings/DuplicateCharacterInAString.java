package Strings;
import java.util.*;
class DuplicateCharacterInAString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();//abcdababefcd
        char arr[]=new char[s1.length()];
        for(int i=0;i<s1.length();i++){
            arr[i]=s1.charAt(i);//arr[0]=a,arr[1]=b,arr[2]=c,arr[3]=d,arr[4]=a...
        }
        Arrays.sort(arr);//aaabbbccddef
        int count=0;
        for(int i=0;i<arr.length;)
        {
           char a=arr[i];//arr[0]=a,arr[3]= b,arr[6]=c,arr[8]=d,arr[10]=e,arr[11]=f
           count=0;
           for(int j=i;j<arr.length;j++)//aaabbbccddef
           {
               if(a==arr[j])
               {
                   count++;// 1 
                   i++;//1 2 3 4 5 6 7 8 9 10 11
               }
           }
           if(count>1)
           {
               System.out.print(a+" ");
           }
        }

    }
}

// abcdababefcd
// a b c d

// aaabcdddeefgh
// a d e