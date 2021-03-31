# JAVA_PROGRAMS
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


