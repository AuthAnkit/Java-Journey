/*
 * Rotate array
Given an array with N elements, the task is to rotate the array to the right by K steps.

Note : if K is negative , rotate the array to the left.

Input Format
The first line contains an integer N representing the size of the array.

The second line contains N space-separated integers representing the elements of the array.

The last line contains an integer K representing the number of times the array has to 
be rotated in the right direction if k is positive , otherwise to the left if k is
 negative.

Output Format
The only line of the output prints N space-separated integers representing the 
Rotated array elements.

Example 1
Input


8
7 5 2 11 2 43 1 1
2

Output

1 1 7 5 2 11 2 43 

Explanation

Rotate 1 steps to the right : 1 7 5 2 11 2 43 1

Rotate 2 steps to the right : 1 1 7 5 2 11 2 43

Example 2
Input


8
7 5 2 11 2 43 1 1
3

Output


43 1 1 7 5 2 11 2 

Explanation

Rotate 1 steps to the right : 1 7 5 2 11 2 43 1

Rotate 2 steps to the right : 1 1 7 5 2 11 2 43

Rotate 3 steps to the right : 43 1 1 7 5 2 11 2

Constraints
1 <= N <= 10^3

1 <= arr[i] <= 10^9

-10^9 <= K < 10^9

Topics
Arrays
Array - Basics
Companies
Wipro
Amazon
MAQ Software
MakeMyTrip
SAP
 */

import java.util.*;
public class arr17{
public static void ArrRev(int arr[] ,int start , int end){
    while(start<end){
    int temp;
    temp = arr[start];
    arr[start]= arr[end];
    arr[end] = temp;
    start ++;
    end--;
    }
}

public static int[] RotateArr(int [] arr , int k){
    int n = arr.length;
    if(k>=n) k = k%n;
    if(k<0)  k=k+n;

    ArrRev(arr,0 , n-k-1);
    ArrRev(arr,n-k,n-1);
    ArrRev(arr, 0, n-1);

    return arr;
    // System.out.print(Arrays.toString(arr));
}

public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // RotateArr(arr, k);
        System.out.print(Arrays.toString(RotateArr(arr, k)));
    }
}

    
}