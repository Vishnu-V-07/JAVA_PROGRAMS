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
        int sell = 0;
        int si = 0;
        int temp = 0;
        int profit = 0;
        for (int i = 0; i < iNum - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                value = arr[i + 1];
                index = i + 2;
                // }
                for (int j = i + 1; j < iNum - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        sell = arr[j + 1];
                        profit = sell - arr[j];
                        // si = j + 2;
                    }
                    if (profit > temp) {
                        temp = profit;
                        si = j + 2;
                    }
                }
            }

        }
        System.out.println("Day of buying : " + index);
        System.out.println("Day of Selling : " + si);
    }
}
