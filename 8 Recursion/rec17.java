/*Count 7
Given a number N, your task is to find the number of occurrences of the digit 7 in the number.

Input Format
The first line contains an integer N denoting the number.

Output Format
For each test case return a number, denoting the number of occurrences of the digit 7 in the given number.

Example 1
Input

27727
Output

3
Explanation

There are 3 occurrences of the digit 7 in the number.

Example 2
Input

17245
Output

1
Explanation

There is 1 occurrence of the digit 7 in the number.

Constraints
1 <= N <= 10^9

Topics
Recursion
Math*/

import java.util.*;

public class 17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count7(n));
        sc.close();
    }

    public static int count7(int n) {
        // your code here
        if(n<10){
            if(n%10==7)return 1;
            return 0;
        }

        if(n%10==7){
            return 1+count7(n/10);
        }

        return count7(n/10);
    }
}
