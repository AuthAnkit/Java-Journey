/*Smallest Number in an Array using Recursion
Given an array arr of length n, you have to find the minimum element present in the array using recursion.

Input Format
First line consists of an integer n, the number of elements in the array

Second line consists of n spaced inetegrs, representing the array arr.

Output Format
Return the minimum element of the array.

Example 1
Input

3
1 2 3
Output

1
Explanation

1 is the smallest among 1, 2 and 3.

Example 2
Input

5
5 4 0 -8 67
Output

-8
Explanation

-8 is the smallest among 5, 4, 0, -8 and 67

Constraints
1 <= n <= 10^3

-10^4 <= arr[i] <= 10^4

Topics
Recursion
Arrays*/

import java.util.*;



public class rec22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(recforMin(arr, n));
    }

	public static int recforMin(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        return Math.min(arr[n - 1], recforMin(arr, n - 1));
    }
}
