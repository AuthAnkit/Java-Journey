/*
 * Array Adding
You have given a number n1, representing the size of array arr1.
 You have given n1 numbers, representing elements of array arr1.
  You have given a number n2, representing the size of array arr2.
  You have given n2 numbers, representing elements of array arr2.
   The two arrays represent the digits of two numbers.

You are required to add the numbers represented by two arrays and
 return the resultant arrays. n1 and n2 are of diferent size

Input Format
First line consists of an integer n1

Second line consists of n1 spaced integers, representing elements of arr1

Third line consists of an integer n2

Fourth line consists of n2 spaced integers, representing elements of arr2

Output Format
Add the two numbers and return the resultant array

Example 1
Input

3
1 2 3
3
3 2 1
Output

4
4
4
Explanation

Adding corresponding elements gives 4 at each index -> 1 + 3 = 2 + 2 = 3 + 1 = 4

Example 2
Input

2
2 1
4
1 2 3 4
Output

1
2
5
5
Explanation

1234 + 21 = 1255

Constraints
0 <= a1[i], a2[i] < 10

Topics
Number System: Number Problems
Arrays
Array - Basics
 */
import java.util.*;
public class arr9{
   
   public static int[] SumArray(int n , int m , int a[] , int b[]){
      int carry =0;
      int sum[] = new int[Math.max(n, m)];
      int i = n-1;
      int j = m-1;
      int k = sum.length-1;
      
      while(k>=0){
         int digit = carry;
         if(i>=0) digit += a[i];
         if(j>=0) digit += b[j];

         sum[k] = digit %10;
         carry = digit / 10;

         i--;
         j--;
         k--;
      }
      if(carry ==0) return sum;
      else{
         int res[]= new int[sum.length+1];
         res[0] = carry;
         for(int idx=1;idx<=res.length-1;idx++){
            res[idx]=sum[idx-1];
         }
         return res;
      }
   }
   public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
         int n = sc.nextInt();
         int a[] = new int[n];
         for(int i = 0;i<n;i++){
          a[i] = sc.nextInt();
         }
         int m = sc.nextInt();
         int b[] = new int[m];
         for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
         }

         System.out.println(Arrays.toString(SumArray(n, m, a, b)));
       }
   }
}