/*
Difference of Sum and Product
You are given an integer number n.

print the difference between the product of its digits and the sum of its digits.

Input Format
single line consisting of an integer n.

Output Format
Print the difference between prod and sum.

Example 1
Input


324

Output


15

Explanation


Product of digits = 3 * 2 * 4 = 24 
Sum of digits =  3 + 2 + 4 = 9 
Result = 24 - 9 = 15

Example 2
Input


8

Output


0

Explanation


Product of digits = 8
Sum of digits =  8
Result = 8 - 8 = 0
 */ 

import java.util.*;
public class loops14{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int sum=0;
    int product=1;

    while(n/10!=0){
        sum=sum+n%10;
        product=product*n%10;
        n=n/10;
    }
    sum=sum+n;
    product=product*n;
    System.out.println(product-sum);
    }
}