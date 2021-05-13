package Collections;
import java.util.*;
public class Country {
    HashSet<String> H1=new HashSet<>();
    public HashSet  saveCountryNames(String CountryName)
    {
        H1.add(CountryName);

        return H1;

    }
    public String getCountry(String CountryName)
    {
        Iterator itr=H1.iterator();
        while(itr.hasNext())
        {
            String s1=(String)itr.next();
            if(CountryName.equals(s1))
            {
                return CountryName;
            }
        }
        return null;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        Country c=new Country();
        for(int i=0;i<iNum;i++)
        {
            c.saveCountryNames(sc.next());
        }
        System.out.println("Enter the element to search");
        String CountryName=sc.next();
        System.out.println(c.getCountry(CountryName));
        sc.close();
        
        
    }
    
}

// I/P:
// 5
// India America Australia Russia Germany
// Enter the element to search
// Australia
// O/P:
// Australia
