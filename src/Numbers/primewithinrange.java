// Some prime numbers can be expressed as a sum of other consecutives prime numbers

// for example,

// 5=2+3,

// 17=2+3+5+7

// 41=2+3+5+7+11+13

// You task is to find out how many prime numbers which satisfy the property are present in

// the range 3 to N subject to a constraint that summation should always start with number 2.

// Write a code to find out the number of prime numbers that satisfy the above mentioned

// property in a given range



// I/P:

// 13



// O/P:

// 2

// 5

// 17

// 41


package Numbers;
import java.util.*;
public class primewithinrange {

    public static boolean isPrime(int n) {
		int count = 0;
		for(int i = 2 ; i <= n ; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count >= 2) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 2 ; i <= n ; i++) {
			if(isPrime(i)) {
				al.add(i);
			}
		}
		int sum = 0;
		for(int i = 0 ; i <al.size() ; i++) {
			sum = sum + al.get(i);
			if(isPrime(sum)) {
				System.out.println(sum);
			}

		}
	}

	
}