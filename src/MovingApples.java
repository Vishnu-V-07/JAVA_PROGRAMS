// Moving Apples
// There are N number of baskets, where the ith basket contains input2[i] apples. We want to move apples between baskets so that all baskets have the same number of apples. What is the minimum number of apples that must be moved?
// It is guaranteed that there exists a way to move apples so as to have an equal number of apples in each basket.
// SampleInput0:
//     input1: 2
//     input2: {1,3}
//  SampleOutput0:
//    Output: 1
// Explanation:
// There are 2 baskets with first containing 1 apple and second containing 3 apples. if we shift one apple from the second container to the first container then both will have 2 apples. So only one apple was required to move.
// Hence the output is 1.
// SampleInput0:
//     input1: 5
//     input2: {2849,1620,705,1,30}
// SampleOutput0:
//    Output: 2387
// Explanation:
// There are 5 baskets containing 2849,1620,705,1 and 30 apples respectively. if we move 336 apples from the 1st container to 3rd container and 579 apples from the 2nd container to 5th container.
// Then each container will have 1041 apples. So, the total apple movement is 336+1040+432+579=2387.
// Hence the output is 2387.
// Input Format
// Input Specification:
// input1: N, denoting the Number of Baskets.
// input2: array representing the number of apples in the ith basket.
// Output Format
// Output Specification:
// Return the minimum number of apples that must be moved so that all baskets have the same number of apples.
import java.util.*;
public class MovingApples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub=sc.nnextInt()
		Scanner sc=new Scanner(System.in);
		int iNum=sc.nextInt();
		int iArr[]=new int[iNum];
		for(int i=0;i<iNum;i++)
		{
			iArr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<iNum;i++)
		{
			sum+=iArr[i];
		}
		int avg=sum/iNum;
		
	        int t1=0;
	        for(int i=0;i<iNum;i++){
	            if(iArr[i]<avg){
	                int t=avg-iArr[i];
	                t1+=t;
	                
	                iArr[i]+=t;
	            }
	            else {
	                int t=iArr[i]-avg;
	                t1+=t;
	          
	                iArr[i]-=t;
	            }
	        }
	        System.out.println(t1/2);


	}

}
