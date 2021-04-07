# JAVA_PROGRAMS

#StringsFolder
YODA



1.Description: As a young jedi you must learn to converse with Yoda. You have found a simple rule that helps change a “normal” sentence into “Yoda talk”. Take the first two words in the sentence and place them at the end. Write a program that uses this rule to change normal sentence into “Yoda talk”.

eg: I/p: I am student of siet

O/p: student of siet I am

ProgramFile:StringConv

#STRINGS FOLDER
1.MyRegex

Problem Statement:
rite a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:

IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
In this problem you will be provided strings containing any combination 
of ASCII characters. You have to write a regular expression to find the 
valid IPs.

Sample Input

000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
Sample Output

true
true
true
false
false
false

2.HammingDistance

Problem Statement:
Balls for Challenge

The Circoloco Children Carnival is the City’s largest and successful event dedicated to children and families. The main focus at the carnival is the workshop arena where kids can participate in engaging and educational activities.

Charlie, a little boy accompanied by his Mom visited the fair, where he participated at the "Balls for Challenge" activity. He was given many balls of white and black colors. During the play, he arranged the balls into two rows both consisting of N number of balls. These two rows of balls are given to you in the form of strings X, Y. Both these string consist of 'W' and 'B', where 'W' denotes a white colored ball and 'B' a black colored.

Other than these two rows of balls, Charlie has an infinite supply of extra balls of each color. He wants to create another row of N balls, Z in such a way that the sum of hamming distance between X and Z, and hamming distance between Y and Z is maximized.

Hamming Distance between two strings X and Y is defined as the number of positions where the color of balls in row X differs from the row Y ball at that position. e.g. hamming distance between "WBB", "BWB" is 2, as at position 1 and 2, corresponding colors in the two strings differ. As there can be multiple such arrangements of row Z, Charlie wants you to find the lexicographically smallest arrangement which will maximize the above value.

Input Format
First line of the input will contain a string X denoting the arrangement of balls in first row.

Second line of the input will contain the string Y denoting the arrangement of balls in second row.

Output Format
Output a single line containing the string of length N denoting the arrangement of colors of the balls belonging to row Z.

Refer sample input and output for formatting specifications.

Sample Input 1
WBWB
WBBB
Sample Output 1
BWWW
Sample Input 2
BBBW
BWBB
Sample Output 2
WBWB
Sample Input 3
WWWW
BBBB
Sample Output 3
WBWB

3.LexiString

Lexi string
Sample Output
3
1Little Jill jumbled up the order of the letters in our dictionary. Now, Jack uses this list to nd the smallest lexicographical string that
can be made out of this new order. Can you help him?
You are given a string P that denotes the new order of letters in the English dictionary.
You need to print the smallest lexicographic string made from the given string S.
Input Format
The rst line contains numbers of test cases, T
The second line has the string P
The third line has the string S
Output Format
Print a single string in a new line for every test case giving the result

Constraints
1 <= T <= 1000
Length (P) = 26
1 <= length (S) <= 100
All characters in the string S, P are in lowercase
For example,
Input:
2
poliktgbvfredcxwqaz
abcd
qwryupcsfoghjkldezxvbintma
ativedoc
Output:
bdca
codevita
Explanation:
The transformed smallest lexicographical strings are in order they would be if order of letters are changed to string P.
Sample Input
2
poliktgbvfredcxwqaz
abcd
qwryupcsfoghjkldezxvbintma

Sample Output
bdca
codevita


4.SimilarChar

Similar char
Tahir and Mamta are working on a project in TCS. Tahir being a problem solver came up with an interesting problem for his friend
Mamta. The problem consists of a string of length N and contains only small case alphabets.
It will be followed by Q queries, in which each query will contain an integer P (1<=P<=N) denoting a position within the string.
Mamta's task is to nd the alphabet present at that location and determine the number of occurrences of the same alphabet
preceding the given location P.
Mamta is busy with her of ce work. Therefore, she asked you to help her.
Input Format
First-line contains an integer N, denoting the length of the string.
Second-line contains string S itself consists of small case alphabets only ('a' - 'z').
The third line contains an integer Q denoting the number of queries that will be asked.
Next, Q lines contain an integer P (1 <= P <= N) for which you need to nd the number occurrence of character present at the Pth location
preceding P
Output Format
For each query, print an integer denoting the answer on a single line.
Constraints
1 <= N <= 500000
S consisting of small case alphabets
1 <= Q <= 10000
1 <= P <= N
For example,
Input:
9
abacsddaa
2
9
3
Output:
3
1
Explanation:
Here Q = 2
For P=9, the character at the 9th location is 'a'. The number of occurrences of 'a' before P i.e., 9 is three.
Similarly, for P=3, 3rd character is 'a'. The number of occurrences of 'a' before P. i.e., 3 is one.
Sample Input
9
abacsddaa
2
9


#ArraysFolder

1.Minimum InEquality

You will be given a list of marks of a student as an array arr and a single integer k. You must create an array of lengthkfromelements such that its inequality is minimized. Call that array as subarr . Inequality of an array is calculated as:inequality = Max(subarr)-Min(subarr)Where:- Max denotes the largest integer in subarr - Min denotes the smallest integer in subarrFor example, consider an array [1,2,6,4] with a k value 2 Pick any two elements, test subarr=[4,1]Inequality = Max(4,1)-Min(4,1)=4-1=3Testing for all pairs, the solution[1,2] provides the minimum Inequality as 1.

 

Input FormatThe rst line contains an integer n, the number of elements in array arr.Each of the next n lines contains an integer arr[i] where 0≤ i <n.The Last line contains an integer k

 

Output FormatAn integer that denotes the minimum possible value of Inequality

 

Constraints2 ≤ n ≤ 1052 ≤ k ≤ n0 ≤ arr[i] ≤ 105

Sample Input

4

1

2

6

Sample Output

1




