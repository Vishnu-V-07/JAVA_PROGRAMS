// You will be given a list of marks of a student as an array arr and a single integer k. You must create an array of lengthkfromelements such that its inequality is minimized. Call that array as subarr . Inequality of an array is calculated as:inequality = Max(subarr)-Min(subarr)Where:- Max denotes the largest integer in subarr - Min denotes the smallest integer in subarrFor example, consider an array [1,2,6,4] with a k value 2 Pick any two elements, test subarr=[4,1]Inequality = Max(4,1)-Min(4,1)=4-1=3Testing for all pairs, the solution[1,2] provides the minimum Inequality as 1.

 

// Input FormatThe rst line contains an integer n, the number of elements in array arr.Each of the next n lines contains an integer arr[i] where 0≤ i <n.The Last line contains an integer k

 

// Output FormatAn integer that denotes the minimum possible value of Inequality

 

// Constraints2 ≤ n ≤ 1052 ≤ k ≤ n0 ≤ arr[i] ≤ 105

// Sample Input

// 4

// 1

// 2

// 6

// Sample Output

// 1

package Arrays;

import java.util.*;

public class MinimumInEquality {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        int arr[] = new int[iNum];
        for (int i = 0; i < iNum; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int val = 0;
        int min = Integer.MAX_VALUE;
        int temp = 0;
        int b[] = new int[k];
        for (int i = 0; i < iNum - 1; i++) {
            temp = i;
            for (int j = 0; j < k; j++) {
                if (temp < iNum) {
                    b[j] = arr[temp];
                    temp++;
                }
            }
            Arrays.sort(b);
            System.out.println(Arrays.toString(b));
            val = b[b.length - 1] - b[0];
            if (min > val) {
                min = val;

            }
        }
        System.out.println(min);

    }

}
