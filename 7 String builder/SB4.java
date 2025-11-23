/*AJ Number
Deepak and Gautam are having a discussion on a new type of number that they call AccioJob Number or AJ Number. They use following criteria to define a AJ Number.

0 and 1 are not a AJ number.

2,3,5,7,11,13,17,19,23,29 are AJ numbers.

Any number not divisible by the numbers in point 2( Given above) are also AJ numbers.

Deepak said he loved AJ numbers.Hearing it, Gautam throws a challenge to him.

Gautam will give Deepak a string of digits. Deepak's task is to find the number of AJ numbers in the string.

AJ number once detected should not be sub-string or super-string of any other AJ number.

Ex- In 4991, both 499 and 991 are AJ numbers but you can choose either 499 or 991, not both.

Further, the AJ number formed can only be a sub-string of the string.

Ex - In 481, you can not take 41 as AJ number because 41 is not a sub-string of 481.

As there can be multiple solutions, Gautam asks Deepak to find the maximum number of AJ numbers that can be formed from the given string.

Deepak has to take class of Launchpad students. Help him by solving Gautam's challenge.

Input Format
The first line of input contains n, the size of string.

The second line of input contains a string of digits str.

Output Format
Maximum number of AJ numbers that can be formed.

Example 1
Input

5
81615
Output

2
Explanation

61 and 5 are two AJ numbers.

Example 2
Input

2
10
Output

0
Explanation

There is 0 AJ number in this string of numbers.

Constraints
1 <= N <= 17

Topics
Greedy
Math
Strings*/


import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        StringBuilder str=new StringBuilder(input.nextLine());
        
        solve(str,n);

        input.close();
    }
	static boolean  check_aj(long num){
    	if(num==0 || num==1)
    		return false;
    	int arr[]={2,3,5,7,11,13,17,19,23,29 };
    	for(int i=0;i<10;i++)
    		if(arr[i]==num)
    			return true;
    	for(int i=0;i<10;i++)
    		if(num%arr[i]==0)
    			return false;
    	return true;
    }
    static boolean isVisted(boolean visted[],int start,int end){
    	for(int i=start;i<end;i++)
    		if(visted[i])
    			return false;
    	return true;
    }
    public static void solve(StringBuilder str,int n){
        // WRITE YOUR CODE HERE
        boolean visted[]=new boolean[100];
    	int count=0;
    	for(int i=1;i<=n;i++){
    		for(int j=0;j<=n-i;j++){
    			if(check_aj(Long.parseLong(str.substring(j,i+j))) && isVisted(visted,j,i+j) ){
    				count++;
    				for(int k=j;k<i+j;k++)
    					visted[k]=true;
    			}
    		}
    
    	}
        System.out.println(count);
    }
}
