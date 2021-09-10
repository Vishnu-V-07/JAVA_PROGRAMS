package Arrays;
import java.util.*;
public class primeCheck {

    public static  boolean isPrime(int iNum)
    {
        int flag=0;
      for(int i=2;i<=iNum/2;i++)
      {
          if(iNum%i==0)
          {
              flag=1;
              break;
          }
      }
      if(flag==0)
      {
          return true;
      }
      return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        if(isPrime(iNum))
        {
           int sum=0;
           int t=iNum;
           while(iNum>0)
           {
              int b=iNum%10;
              sum+=b;
              iNum/=10;
           }
           if(isPrime(sum))
           {
               System.out.println(t);
           }
           else{
               System.out.println("Not a prime num");
           }
        }
        else{
            System.out.println("Not a prime num");
        }
    }
}

// Write a program to find a given number is prime or not ,
// If it is prime then find the sum of the primenumber digits also a prime number or not

// 13
// 13 is a prime num 1+3=4 is not a prime num so o/p is
// Not a prime num

// 43
// 43 is prime num 4+3=7 is  prime num ,so op 43 will be printed
// 43