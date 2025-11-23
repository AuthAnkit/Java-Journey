/*
 * Print A to Z
You are required to write a program that prints Upper-Case Characters from A to Z

Input Format
No input required

Output Format
Print A to Z

Example 1
Input


No input required

Output


A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 

Explanation


Print A to Z.
 */
public class loops22{
    public static void main(String[] args) {
        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch+" ");
        }
    }
}