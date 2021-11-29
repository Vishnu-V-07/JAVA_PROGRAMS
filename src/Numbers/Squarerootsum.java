package Numbers;




import java.util.*;
public class Squarerootsum {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        int e=a*a;
        int f=b*b;
        int g=e+f;
        int h=(int)Math.sqrt(g);
        System.out.println(h);

        int i=c*c;
        int j=d*d;
        int k=i+j;
        int l=(int)Math.sqrt(k);
        System.out.println(l);
    }
    
}
