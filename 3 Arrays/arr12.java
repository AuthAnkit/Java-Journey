/*
 * Array Problem 6
Write a program to find out the shortest distance between two even positive integers
in an array arr and print the distance. If there is one or zero even positive integer 
in the array then return -1.

Note that if the index of one even positive integer is i and the index of another
 even positive integer is j then their distance will be |i-j|.

Input Format
First line contains n which is the size of the array.
Second line contains n elements of the array.

Output Format
Return the shortest distance if more than one even positive integer is present or
 return -1 if only one or no even positive integer is present.

Example 1
Input

2
1 2
Output

-1
Explanation

There is only 1 even positive integer in the array. So the output will be -1.
Example 2
Input

5
2 4 1 6 7
Output

1
Explantion

Distance between 2 and 4 is 1,  
distance between 2 and 6 is 3,  
distance between 4 and 6 is 2.   
So the shortest distance is 1.
Constraints
0 <= n <= 10^5
-10^9 <= arr[i] <= 10^9

Topics
Loops
Basics
Arrays
Array - Basics
Math
 */

import java.util.*;
public class arr12{
    public static int ShortestDistance(int n , int[]arr){
        int prev =-1;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]%2==0){
                
                if(prev==-1){
                    prev = i;
                }
                else{
                    ans = Math.min(ans,i-prev);
                    prev = i;
                }
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1 ;    
        }
        return ans;
    }
    public static void main(String[] args) {
        try(Scanner sc  = new Scanner(System.in)){
            int n= sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(ShortestDistance(n, arr));
        }
    }
}

