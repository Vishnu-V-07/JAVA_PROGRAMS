// BRILLIANT BINGO

// Given a number in each round of the game the players have to multiply their number with the round number.
// The game stops when a player gets all the numbers from 0 to 9 and its a brilliant game bingo.

// I/P:
// 7892

// O/P:
// 5

package Numbers;
import java.util.*;
public class BrilliantBingo {
    
    public static void Bingo(int iNum)
    {
        TreeSet<Integer> ts=new TreeSet<>();
        int i=1,r=0;
        while(ts.size()!=10){
          
          int dup=iNum*i;
          int t=0;
          
          while(dup>0)
          {
                t=dup%10;
                ts.add(t);
                dup/=10;

          }
        
          r++;
          i++;
        }
        System.out.println(r);
          

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        Bingo(iNum);
    }
    
}
