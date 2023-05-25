/* Problem Statement: 
Write a program to find the last digit of the number
for eg.  let's say n = 4567 so the last digt would be 7;
n = 4; last digit is 4
n = 47; last digit is 7
*/

/*Problem Statement:
among the digits from 0 to 9 TheComputerman likes 5. he has lots of numbers and want you to find it out the number of times 5
occured in the number.

INPUT FORMAT: the first line an integer 'T' denoting the number of test cases. EACH OF THE NUMBR 'T' lines contains a single integer N.

OUTPUT FORMAT:  for each test cases print number 5 occured in N on a new line
CONSTRAINS:
1<=T<10
1<=N<=10^6

TIME LIMIT:
1 SEC
*/

import java.util.Scanner;
public class FavouriteNumber {
public static void main(String args[])
{
int a;
int n;
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
while(a-->0)
{
  int rem, count =0;  
  n = sc.nextInt();
while(n!=0)
{
  rem = n%10;
  n =n/10;
  if(rem ==5)
  {
    count++;
  }
}
System.out.println(count);
}  
}
}