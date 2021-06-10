package TwoDArrays;
import java.util.*;
public class wordPresentinOrder {
    public static void toFind(char arr[][],int iNum,String s1)
    {
        int r=iNum;int c=iNum;
        int row=0,col=0;
        int count=0;
        int count2=0;
        int flag=0;
        while(row<r || col<c)
        {
            for(int j=0;j<s1.length();j++)
            {
                char a=s1.charAt(j);
                for(int i=col;i<c;i++)
                {
                    if(a==arr[row][i])
                    {
                        count++;
                      
                    }
                    
                }
                for(int i=row;i<r;i++)
                {
                    if(a==arr[i][col])
                    {
                        count2++;
                      
                    }
                    
                }
            }
            if(count==s1.length() || count2==s1.length())
            {
                System.out.println("The word is present in the array");
                flag=1;
                break;
            }
            else{
                row++;
                col++;
            }
        }
        if(flag==0)
        {
            System.out.println("the word is not present");
        }
        
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        char arr[][]=new char[iNum][iNum];
        for(int i=0;i<iNum;i++)
        {
            for(int j=0;j<iNum;j++)
            {
                arr[i][j]=sc.next().charAt(0);
            }
        }
        String  searchWord=sc.next();
        toFind(arr,iNum,searchWord);

    }
    
}

// I/P:

// 3
// a b c
// d e f
// g h i
// adg

// O/P:

// The word is present in the array