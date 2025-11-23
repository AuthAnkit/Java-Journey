/*
 * Sum of Digits
You are given a number. Your task is to find the sum of all the digits in the number.

Input Format
The only line of input contains a number.

Output Format
Print the sum of digits of the given number.

Example 1
Input

1873
Output

19
Explanation

1+8+7+3 = 19. Hence the output should be 19.

Example 2
Input

 
Output

22
Explanation

The sum of the digits is 22.
 */

 import java.util.*;
 public class loops13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;

        while(n/10!=0){
            sum=sum+n%10;
            n=n/10;
        }
        sum=sum+n;
        System.out.println(sum);
    }
 }