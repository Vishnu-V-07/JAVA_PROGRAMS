package Collections;
import java.util.*;
public class MapCountry {
    HashMap<String,String> M1=new HashMap<>();
    public HashMap  saveCountryCapital(String CountryName,String capital)
    {
        M1.put(CountryName,capital);

        return M1;

    }
    public String getCapital(String CountryName)
    {
        String s3=M1.get(CountryName);
        return s3;

    }
    public String getCountry(String capitalName)
    {
        String s9="";
        Set<Map.Entry<String,String>> set1=M1.entrySet();
        for(Map.Entry<String,String> entry:set1)
        {
            String s6=entry.getValue();
            if(s6.equals(capitalName))
            {
                s9=entry.getKey();
                
            }
            s6="";
        }
        return s9;
        

    }
    public HashMap createAnotherMap()
    {
        HashMap<String,String> M2=new HashMap<>();
        Set<Map.Entry<String,String>> set1=M1.entrySet();
        for(Map.Entry<String,String> entry:set1)
        {
            String s6=entry.getKey();
            String s7=entry.getValue();
            M2.put(s7,s6);
        }
        return M2;

    }
    public ArrayList createArrayList()
    {
        ArrayList<String> al2=new ArrayList<>();
        Set<Map.Entry<String,String>> set1=M1.entrySet();
        for(Map.Entry<String,String> entry:set1)
        {
            String s8=entry.getKey();
            al2.add(s8);
        }
        Collections.sort(al2);
        return al2;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        MapCountry m=new MapCountry();
        for(int i=0;i<iNum;i++)
        {
            m.saveCountryCapital(sc.next(),sc.next());
        }
        System.out.println("Enter the Country Name: ");
        String CountryName=sc.next();
        String s2=m.getCapital(CountryName);
        System.out.println(s2);
        System.out.println("Enter the Capital Name: ");
        String capitalName=sc.next();
        String s4=m.getCountry(capitalName);
        System.out.println(s4);
        HashMap<String,String> hm=m.createAnotherMap();
        System.out.println(hm);
        ArrayList<String> al=m.createArrayList();
        System.out.println(al);
        sc.close();
        
    }
    
}

// 5
// India Delhi
// Australia Canberra
// England London
// Japan Tokyo
// Italy Rome