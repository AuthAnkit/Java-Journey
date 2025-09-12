/*
 * Index of Element
You are given an integer array Arr of size N and a number X. You need to print all the indexes of the given X in the array, else print -1.

Note : You have to give output in 1-based indexing.

Input Format:

The first line of input contains N and X representing the number of elements and the number whose indexes is to be given respectively.

The second line of input contains N space separated integers, representing elements of the array Arr.

Output Format:

Print the indexes of number X in the array Arr, else print -1.

Example 1:

Input

5 1
2 1 3 1 1
Output:

2 4 5
Explanation:

1 is present at index 2, 4 and 5.

Example 2:

Input

5 1
2 4 3 5 6
Output:

-1
Explanation:

1 is not present in the array, so we print -1.

Constraints:

1 <= N <= 10^5

1 <= X <= 10^6

1 <= Arr[i] <= 10^6
 */

import java.util.Scanner;

public class arr1 {
    public static void IndexOfElement(int n, int x, int[] arr){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.print(i+1+" ");
                count++;
            }
           
            }
             if(count==0){
                System.out.print("-1");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            IndexOfElement(n, x, arr);
        }
    }
}   
