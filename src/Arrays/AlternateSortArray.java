package Arrays;
import java.util.*;
public class AlternateSortArray {

    public static void  Alternate (ArrayList<Integer> al)
    {
        ArrayList<Integer> al2=new ArrayList<>(al);
        
        Collections.sort(al);
        ArrayList<Integer> al3=new ArrayList<>(al2);
        Collections.sort(al3,Collections.reverseOrder());
        int j=0,k=0;
        for(int i=0;i<al.size();i++)
        {
            if(i%2==0)
            {
                System.out.print(al3.get(j)+" ");
                j++;
            }
            else{
                System.out.print(al.get(k)+" ");
                k++;
            }
        }

       

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();//5
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<iNum;i++)
        {
            al.add(sc.nextInt());
        }
        Alternate(al);
    }
    
}

// I/P:


// 5
// 1 7 11 16 19

// O/P:
// 19 1 16 7 11




//Another method:
// int arr[]=new int[a.length];
    // int dup=0;
    // for(int i=0;i<d;i++)
    // {
       
    //     if(i==0){
    //     int k=0;
    //     for(int j=1;j<a.length;j++)
    //     {
    //         arr[k]=a[j];
    //         k++;
    //     }
    //     arr[a.length-1]=a[0];
    //      System.out.println(Arrays.toString(arr));
    //     }
    //     else{
    //         int k=0;
    //         dup=arr[0];
    //     for(int j=1;j<a.length;j++)
    //     {
    //         arr[k]=arr[j];
    //         k++;
    //     }
    //     arr[a.length-1]=dup;
    //      System.out.println(Arrays.toString(arr));
    //     }
        
    // }
    
    // return arr;
    
