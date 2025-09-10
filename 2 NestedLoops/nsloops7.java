/*
 * Star Pattern 4
Take input of N from the user and write a program to print the following pattern (N=4) :


* * * *  
  * * *  
    * * 
      *

Input Format
First line contains an integer N.

Output Format
Print the required pattern.

Example 1
Input

4 

Output

* * * *  
  * * *  
    * * 
      *

Explanation

Pattern for N=4.

Example 2
Input

3 

Output

* * * 
  * * 
    *

Explanation

Pattern for N=3. 

Constraints
1 <= N <= 15
Topics
Loops
 */
import java.util.*;
public class nsloops7 {

    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();

            for(int row=1;row<=n;row++){
                for(int col=1;col<=n;col++){
                    if(col<row){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}