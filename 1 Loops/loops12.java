/*
 * Reverse digits of a Number
Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.

For example, if the input is 12345, the output should be 54321.

Note: Input number will not have any trailing zeros.

Input Format
The first line of input contains the integer n.

Output Format
The output should be the reverse of n.

Example 1
Input

12345
Output:

54321
Example 2
Input

143323
Output

323341
 */

import java.util.*;
public class loops12{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nn = 0;
            while(n/10!=0){
                nn=nn+n%10;
                n=n/10;
                System.out.print(nn);
                nn=0;
        
        }
        System.out.print(n);
    }
}