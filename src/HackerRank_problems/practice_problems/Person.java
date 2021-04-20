// Day 4: HackerRank 30 Days Of Code  | Class vs. Instance |

// Day 4: Class vs. Instance

// Problem



// Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter The constructor must assign initialAge argument to age after confirming the argument passed as initialAge is not negative if a negative is passed as initial Age,the constructor should set age to 0 and print Age is not valid, setting age to 0 and print Age is not valid, setting age to 0..In addition,you must write the following instance methods:

// 1. yearPasses() should increase the age instance variable by 1.

// 2. amIOld() should perform the following conditional actions:

// If age < 13 print You are young..

// If age > 13 and age < 18, print You are a teenager..

// Otherwise, print You are old..


// Input Format

// Input is handled for you by the stub code in the editor..

// The first line contains an integer, T (the number of test cases), and the
// T subsequent lines each contain an integer denoting the age of a Person instance.

// Constraints

// • 1<= T < =4

// • -5 <=age<=30


// Output Format

// Complete the method definitions provided in the editor so they meet the specifications outlined above,
// the code to test your editor. If your methods are implemented correctly, 
//each test case will print 2 or 3 lines (depending on whether or not a valid 
//initialAge was passed to the constructor).

// Sample Input

//  4
// -1
// 10
// 16
// 18

// Sample Output

// Age is not valid, setting age to 0.
// You are young.
// You are young.

// You are young.
// You are a teenager.

// You are a teenager.
// You are old.

// You are old.
// You are old.
// Explanation



 

// Solution:

package HackerRank_problems.practice_problems;

import java.util.*;

public class Person {
    private int age; 
  
 public Person(int initialAge) {
    // Add some more code to run some checks on initialAge
          this.age=initialAge;
 }
 public void amIOld() {
          if(age<=0){
              age=0;
              System.out.println("Age is not valid, setting age to 0.");
              System.out.println("You are young.");
          }
          else if(age<13){
            System.out.println("You are young.");
          }
          else if(age>=13 && age<18){
              System.out.println("You are a teenager.");
          }
          else{
        System.out.println("You are old.");
          }
 }
 public void yearPasses()
 {
    // Increment this person's age.
        age=age+1;
 }

 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in); // reader
  int T = sc.nextInt();
  for (int i = 0; i < T; i++) {
   int age = sc.nextInt();
   Person p = new Person(age);
   p.amIOld();
   for (int j = 0; j < 3; j++) {
    p.yearPasses();
   }
   p.amIOld();
   System.out.println();
        }
  sc.close();
    }
}

    

