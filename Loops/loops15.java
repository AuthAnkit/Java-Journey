/*
 * Print Digits
Given the number n, print its digits starting from most significant digit to least significant digit.

Input Format
Input consists of single line which has the integer n.

Output Format
print the digits of number one line at a time.

Example 1
Input

1256
Output

1
2
5
6
Explanation

Here, the digits are, 1,2,5,6.

Example 2
Input

12345
Output

1
2
3
4
5
 */
import java.util.*;
public class loops15{
    public static void main(String[] args) {
        try(Scanner sc =  new Scanner(System.in)){
        int n = sc.nextInt();
        int nn ;
        int rev =0;
        int ld =0;
        int count =0;
        while(n!=0){
            ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
            count++;
        }
        
        while(count>0){
            nn = rev%10;
            System.out.println(nn);
            rev=rev/10;
            count--;
        }
    }

    }
}