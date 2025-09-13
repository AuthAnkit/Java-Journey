/*
 * Array Problem 4
Write a program to find out the difference between sum of
 all the elements in two arrays arr1 and arr2.
If sum of all elements in arr1 is larger then, 
the output should be First array is larger,
if sum of all elements in arr2 is larger then,
 the output should be Second array is larger,
otherwise the output should be Both are equal.

Input Format
First line contains n, size of the first array.

Second line contains n elements of the first array.

Third line contains m, size of the second array.

Fourth line contains m elements of the second array.

n and m will always be equal.

Output Format
Print the output as per difference.

Example 1
Input

2
1 2
2
3 4
Output

Second array is larger
Explanation

Overall sum of first array is 1+2 = 3
Overall sum of second array is 3+4 = 7
Thus, second array is larger

Example 2
Input

3
1 2 10
3
3 4 1
Output

First array is larger
Explanation

Overall sum of first array is 1+2+10 = 13
Overall sum of second array is 3+4+1 = 8
Thus, first array is larger

Example 3
Input

2
1 3
2
2 2
Output

Both are equal
Explanation

The overall sum of the first array is 1+3 = 4
The overall sum of the second array is 2+2 = 4
Thus, both are equal

Constraints
n = m
1 <= n <= 10^6
-10^6 <= arr1[i],arr2[i] <= 10^6

Follow-up
Calculate the sum of both of the arrays using 1 loop.

Topics
Loops
Basics
Arrays
Array - Basics
 */

import java.util.Scanner;

public class arr6{
    public static void SumDif(int arr1[] , int arr2[]){
        int sumA=0;
        int sumB=0;

        for(int nums : arr1){
            sumA += nums;
        }

        for(int nums : arr2){
            sumB += nums;
        }

        if(sumA>sumB){
            System.out.print("First array is larger");
        }
        else if(sumB>sumA){
            System.out.print("Second array is larger");
        }
        else{
            System.out.print("Both are equal");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr1[]  = new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }

            n=sc.nextInt();
            int arr2[] = new int[n];
            for(int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            SumDif(arr1, arr2);
        }
        
    }
}