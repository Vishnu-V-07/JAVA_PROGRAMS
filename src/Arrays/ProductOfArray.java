package Arrays;

import java.util.*;

public class ProductOfArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int arr2[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int prod = 1;
        for (int i = 0; i < a; i++) {
            prod = 1;
            for (int j = 0; j < a; j++) {
                if (i != j) {
                    prod *= arr[j];

                }
            }
            arr2[i] = prod;
        }
        System.out.println(Arrays.toString(arr2));
    }
}