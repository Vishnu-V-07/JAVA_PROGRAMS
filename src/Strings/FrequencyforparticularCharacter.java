package Strings;
import java.util.*;
class FrequencyforparticularCharacter{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char c=sc.next().charAt(0);
        String arr[]=s1.split(" ");
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            String s2=arr[i];
            for(int j=0;j<s2.length();j++)
            {
                al.add(s2.charAt(j));
            }

        }
        int a=Collections.frequency(al,c);
        System.out.println(a);
    }
}

// hi hello how are you
// h
// 3