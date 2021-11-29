package Basics;
public class InitializationOf2dArray {
    
    public static void main(String args[])
    {
        int arr[][]={{1,2},{3,4}};//2x2
        int a2[][]={{1,2,3},{3,4,5},{5,6,7}};//3x3

        System.out.println("arr[0][0] = "+arr[0][0]);//1
        System.out.println("arr[0][1] = "+arr[0][1]);//2
        System.out.println("arr[1][0] = "+arr[1][0]);//3
        System.out.println("arr[1][1] = "+arr[1][1]);//4
    }
}
/* 00 01 == 1  2
   10 11    3  4


   00 01 02      1  2  3
   10 11 12  ==  3  4  5
   20 21 22      5  6  7



   */

