package Basics;
import java.util.*;
public class Break {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10");
        int iNum=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            if(i>iNum)
            {
                break;
            }
            else{
                System.out.println(i);
            }
        }


    }
    
}


// Enter a number from 1 to 10
// 5
// 1
// 2
// 3
// 4
// 5