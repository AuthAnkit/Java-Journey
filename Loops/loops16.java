/*
 * Palindrome Checker
Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backwards as forward.

Note: Input number will not have any trailing zeros.

Input
The line inputs N.

Output
You need to print "true" if the number is palindrome otherwise "false" (without quotes).

Example 1
Input

5
Output

true 
Example 2
Input

121
Output

true 
 */


import java.util.*;
public class loops16{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int myNum=n;
            int lastdigi =0;
            int revnum =0;
            while (n!=0){
                lastdigi = n%10;
                revnum =(revnum*10)+lastdigi;
                n/=10;
            }
            System.out.println(revnum);
            if(revnum==myNum){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
}