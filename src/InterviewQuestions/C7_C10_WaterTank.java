// Year is 3030, water is a scare resource. civilizations live around glaciers in clusters, with a federal body (identified as F) in center melting glaciers and controlling the water distribution. Each cluster has need for water for a day and water for a day and a water storage capacity. Cluster are connected to each other with a pipe identified by _ . pipes are flow controlled and water flows in forward direction only. Every time water starts flowing through pipe. The clusters drain their tanks for use in other activities, as they can use the water flowing to fill the tanks, and federal body sends water till the capacity is full. Tanks are empty at beginning of day, water tanks fill in an instant. Clusters don’t share their water with other clusters, but allow federal water to flow through the pipe.

// Federal body releases water at start of day, clusters uses water at end of day. In a pipe link like F-C1--C2-C3-C4. When federal water body targets C3, only C3 and nodes before it (here C1,C2,C3) can fill the tank, C4 can fill it only when its targeted. Calculate the minimum water needed to help the civilizations survive for n days.

// Input Format

// Input is multiple. First line is the number of days to survive. Second line the number of clusters followed by their definitions. Next Is the number of links in the system, followed by the link definitions.

// Cluster definition C1 100 300

// C1 - Cluster name 100 – daily water need 300 – storage capacity

// Link definition F_C1 F – is the federal source of pipe C – Is the sink destination of pipe (Cluster tank)

// Output Format

// Minimum Water required

// Sample Input 0

// 2 
// 3 
// C1 100 300 
// C2 150 300 
// C3 100 100 
// 3 
// F_C1 
// F_C2 
// C2_C3 
// Sample Output 0

// 1100
// Sample Input 1

// 3
// 4
// C1 100 300
// C2 100 300
// C3 100 200
// C4 100 400
// 4
// F_C1
// F_C2
// C2_C3
// C3_C4
// Sample Output 1

// 1700
package InterviewQuestions;
import java.util.*;
public class C7_C10_WaterTank {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int c=sc.nextInt();
        sc.nextLine();
        String arr[][]=new String[c][c];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.next();
            }
        }
        int sum=0;
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(j==2)
                {
                   sum+=Integer.parseInt(arr[i][j]); 
                }
            }
        }
        for(int i=1;i<c;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(c>3)
                {
                    if(i<c-1 && j==2)
                    {
                        sum+=Integer.parseInt(arr[i][j]);
                    }
                }
                else{
                    if(i<=c-1 && j==2)
                    {
                        sum+=Integer.parseInt(arr[i][j]);
                    }
                }
            }
        }
        System.out.println(sum);
        
    }
    
}
