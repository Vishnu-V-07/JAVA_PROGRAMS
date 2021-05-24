package Oops;
import java.util.*;
public class CopyConstructor {

    String FruitName;
    int price;
    public CopyConstructor(String N,int p)
    {
        FruitName=N;
        price=p;
    }
    CopyConstructor(CopyConstructor cc)
    {
        FruitName=cc.FruitName;
        price=cc.price;
    }
    String showFruitName()
    {
        return FruitName;
    }
    int showFruitPrice()
    {
        return price;
    }
    public static void main(String args[])
    {
        CopyConstructor cc=new CopyConstructor("Mango",50);
        System.out.println(cc.showFruitName());
        System.out.println(cc.showFruitPrice());
        CopyConstructor cc2=new CopyConstructor(cc);
        System.out.println(cc2.showFruitName());
        System.out.println(cc2.showFruitPrice());

    }
}
