/*Composite Numbers
You are given an array A consisting of N integers. You have to remove all the composite numbers from the array.

Note Complete the given function and print the updated array. The input and output would be handled by the driver code.
 You have to return the final arraylist.

1 is neither prime nor composite.

Input Format
The first line an integer N.

The next line contains N integers.

Output Format
Return the updated arraylist.

Example 1
Input

4
3 12 13 15
Output

3 13
Explanation

12 and 15 are composite, thus, they are removed.

Example 2
Input

2
4 2
Output

2
Explanation

4 is the only composite number. It is removed.

Constraints
1 <= N <= 10000

1 <= A[i] <= 10000

Topics
Arrays */

import java.util.*;
public class AL1{
    public static ArrayList CompositeNum(int arr[]){
        ArrayList<Integer>list = new ArrayList<>();
        for(int val : arr){
            if(isPrime(val)==true){
                list.add(val);
            }
        }
        return list;
    }

    public static boolean isPrime(int val){
        for(int i=2;i<val;i++){
            if(val%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            ArrayList<Integer> list = CompositeNum(arr);
    for(int val : list) System.out.print(val+" ");
        }
    }
}
