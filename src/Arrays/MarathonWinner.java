package Arrays;

import java.util.*;

public class MarathonWinner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[b + 1];
        int temp[] = new int[b + 1];
        int g = 0;
        for (int k = 0; k < a; k++) {
            for (int i = 0; i < b + 1; i++) {
                arr[i] = sc.nextInt();
            }
            int c = arr[arr.length - 1];
            int h = 0;
            int d = 0, e = 0, f = 0;
            for (int i = 0; i <= 4; i = i + 2) {
                f = 0;
                d = arr[i] * c;
                e = arr[i + 1] * c;
                f = d + e;
                h += f;
                // System.out.println(h);

                temp[g] = h;
                g++;
            }
        }
        System.out.println(Arrays.toString(temp));
        int fc = 0, sec = 0, tc = 0;
        for (int i = 0; i < a; i++) {
            if (temp[i] > temp[i + 3] && temp[i] > temp[i + 6]) {
                fc++;
            } else if (temp[i + 3] > temp[i] && temp[i + 3] > temp[i + 6]) {
                sec++;
            } else if (temp[i + 6] > temp[i] && temp[i + 6] > temp[i + 3]) {
                tc++;
            }

        }
        if (fc > sec && fc > tc) {
            System.out.println("1");
        } else if (sec > fc && sec > tc) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
