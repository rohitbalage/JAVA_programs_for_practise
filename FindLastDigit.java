/* Problem Statement: 
Write a program to find the last digit of the number
for eg.  let's say n = 4567 so the last digt would be 7;
n = 4; last digit is 4
n = 47; last digit is 7
*/

import java.util.Scanner;
public class FindLastDigit {
public static void main(String args[])
{
int a;
Scanner sc = new Scanner(System.in);
  a=sc.nextInt();
  if(a>10)
  {
    int c= a%10;
    System.out.println(c);
  }else
     {
    System.out.println(a);
     }
  }
  

}
