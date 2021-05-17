package Numbers;
import java.util.*;
public class TimeConversion {
    public static void tofind(int iNum)
    {
        int day=iNum/(24*3600);
        iNum=iNum%(24*3600);
        int Hours=iNum/3600;
        iNum=iNum%3600;
        int Mins=iNum/60;
        iNum=iNum%60;
        int Secs=iNum;
        if(day!=0)
        {
            System.out.println("Day: "+day);
        }
        System.out.println("Hours: "+Hours+" Mins: "+Mins+" Secs: "+Secs);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        tofind(iNum);
    }
    
}

// I/P:
// 1321856

// O/P:
// Day: 15
// Hours: 7 Mins: 10 Secs: 56
