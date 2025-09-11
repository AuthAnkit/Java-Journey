
import java.util.Scanner;

public class nsloops14 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        for (int i = m; i<=n; i++){
            int digits=0 ,temp=i,sum=0 ,last;
            while(temp>0){
                temp/=10;
                digits++;
            }
            temp=i;
            while(temp>0){
                last = temp % 10;
                sum +=  (Math.pow(last, digits));
                temp = temp/10;
            }
            if(i == sum){
                System.out.print(i+" ");
            }
        }
    }
}}