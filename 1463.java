import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class practice{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N < 1 || N > 1000000) System.exit(0);

        int[] dp = new int[N+1];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=N;i++){
            dp[i]=dp[i-1]+1;
            if(i%2==0) dp[i]=Math.min(dp[i],dp[i/2]+1);
            if(i%3==0) dp[i]=Math.min(dp[i],dp[i/3]+1);
        }
        System.out.println(dp[N]);
    }
}