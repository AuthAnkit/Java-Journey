/*
 * 2nd Largest from array
Given an unsorted array of size N find the 2nd largest element from the array 
without sorting the array.

Input Format
The first line contains a single integer N.

The second line consists of N integers of the array.

Output Format
Print the second largest number in the new line.

Example 1
Input

6
3 2 1 5 6 4
Output

5
Explanation

5 is the second largest element of the array.

Example 2
Input

9
10 1 7 2 5 6 8 9 3
Output

9
Explanation

9 is the Second largest element in the array

Constraints:
2 <= N <= 10^5

-10^5 <= N <= 10^5

Topics
Arrays
Array - Basics
 */


import java.util.*;
public class arr11{

    public static int SecondElement(int n , int arr[]){
        int  smax = Integer.MIN_VALUE;
        int max  = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax){
                smax = arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.print(SecondElement(n, arr));
        }
    }
}