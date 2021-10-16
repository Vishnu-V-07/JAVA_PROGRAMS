package Arrays;
import java.util.*;
public class ProvidingMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if( n>=1 && n<=60)
        {
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
             for(int i=0;i<n;i++)
            {
                int a=arr[i];
                if(a>=38)
                {
                    int b=a/5;
                   
                    int c=(b+1)*5;
                    int d=c-a;
                    if(d<3)
                    {
                        System.out.println(c);
                    }
                    else{
                        System.out.println(a);
                    }
                }
                else{
                    System.out.println(a);
                }
            }
            
        }
    }
}

//Admatic drive question

//Hackerland University has the following grading policy

//Every student receives a grade in the inclusive range from 0 to 100

//Any grade less than 38 is failing grade


// I/P:

// 4
// 73
// 67
// 38
// 33

// O/P:
// 75
// 67
// 48
// 33


// EXPLANATION:

// 73 =>73 the next multiple of 5 from 73 is 75.
// Since 75-73<3 = So output will be 75

// 67 =>67 the next multiple of 5 from 67 is 70.
// Since 70-67==3 = So output will be 67

// 38 =>38 the next multiple of 5 from 38 is 40
// Since 40-38<3 = So output will be 40

// 33 =>33 IS BELOW 38 SO O/P WILL BE 33(Fail)




    

