package Basics;

import java.util.*;
class LoopingThroughArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements in the array are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


// 5
// 1 2 3 4 5
// Elements in the array are:
// 1 2 3 4 5