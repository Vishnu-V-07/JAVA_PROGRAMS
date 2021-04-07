package Strings;

import java.util.*;

public class StockPrice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        int arr[] = new int[iNum];
        for (int i = 0; i < iNum; i++) {
            arr[i] = sc.nextInt();
        }
        int value = 0;
        int index = 0;
        int max= 0;
        
        for(int i=0;i<iNum;i++)
        {
            for(int j=i+1;j<iNum;j++)
            {
                if(arr[j]-arr[i]>max)
                {
                    max=arr[j]-arr[i];
                    value=i+1;
                    index=j+1;
                }
            }
        }
        System.out.println("Day of buying : " + value);
        System.out.println("Day of Selling : " + index);
    }
}
