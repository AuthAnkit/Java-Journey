/*Maximum Sum Subarray
Given an array arr of size N. The task is to find the sum of the contiguous subarray within a arr with the largest sum.

Input Format
First line consists of an integer n

Second line consists of n spaced integers

Output Format
Print the maximum subarray sum present in the array

Example 1
Input

5
2 3 1 -1 0
Output

6
Explanation

Maximum subarray sum = 2 + 3 + 1

Example 2
Input

8
-2 -3 4 -1 -2 1 5 -3
Output

7
Explanation

Maximum subarray sum = 4-1-2+1+5

Constraints
1 <= n <= 10^4

-100 <= arr[i] <= 100

Topics
Arrays
Array - Basics

Companies
ServiceNow
Intuit
Citadel
Facebook
ByteDance
Samsung
PayTM
Amazon
IBM
Paypal
Goldman Sachs
Tesla
Intel
tcs
Shopee
Poshmark
Bloomberg
Oracle
Infosys
Adobe
Cisco
VMware
Apple
JPMorgan
Uber
Grab
Google
Walmart Global Tech
Microsoft
Morgan Stanley
LinkedIn
Salesforce
eBay
Yahoo
Splunk
Cognizant
 */

import java.util.*;
public class arr20{
    public static int MaxSumSubArr(int arr[] , int n){
        int MaxNow =Integer.MIN_VALUE ;
        int curr=0;
        for(int i =0;i<n;i++){
            curr=curr+arr[i];
            if(MaxNow<curr) MaxNow = curr;
            if(curr<0) curr=0;
        }
        return MaxNow;
    }
public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(MaxSumSubArr(arr, n));
    }

}
}