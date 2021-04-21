// A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become . Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.

// Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

// Function Description

// Complete the function rotLeft in the editor below.

// rotLeft has the following parameter(s):

// int a[n]: the array to rotate
// int d: the number of rotations
// Returns

// int a'[n]: the rotated array
// Input Format

// The first line contains two space-separated integers  and , the size of  and the number of left rotations.
// The second line contains  space-separated integers, each an .

// Constraints

// Sample Input

// 5 4
// 1 2 3 4 5
// Sample Output

// 5 1 2 3 4
// Explanation

// When we perform  left rotations, the array undergoes the following sequence of changes:


package Arrays;
import java.util.*;
public class ArrayRotation {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    // Complete the rotLeft function below.
        int n1=sc.nextInt();
        int d=sc.nextInt();
        int a[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        int length = a.length;
        int j = 0;
        int[] temp = new int[length];
        
        for(int i = d; i < length; i++, j++) {
            temp[j] = a[i];
        } 
        if(j < length) {
             for(int i = 0; i < d; i++, j++) {
                 temp[j] = a[i];
             }
        }
       
        for(int i=0;i<n1;i++)
        {
            System.out.print(temp[i]+" ");
        }
    
    }
}

//Another method:
// int arr[]=new int[a.length];
    // int dup=0;
    // for(int i=0;i<d;i++)
    // {
       
    //     if(i==0){
    //     int k=0;
    //     for(int j=1;j<a.length;j++)
    //     {
    //         arr[k]=a[j];
    //         k++;
    //     }
    //     arr[a.length-1]=a[0];
    //      System.out.println(Arrays.toString(arr));
    //     }
    //     else{
    //         int k=0;
    //         dup=arr[0];
    //     for(int j=1;j<a.length;j++)
    //     {
    //         arr[k]=arr[j];
    //         k++;
    //     }
    //     arr[a.length-1]=dup;
    //      System.out.println(Arrays.toString(arr));
    //     }
        
    // }
    
    // return arr;
    


