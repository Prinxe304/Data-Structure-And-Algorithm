import java.util.*;

public class E {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
long INF = (long) 1e18;
    while(test-- > 0){
      int n  =sc.nextInt();
      int[] arr = new int[n+1];

      for(int i=1; i<=n; ++i){
        arr[i] = sc.nextInt();
      }

      long[] dp = new long[n+1];
      Arrays.fill(dp , INF);
      for(int i=1; i<=n; ++i){
        dp[arr[i]] = 1;
      }

      for(int i=1; i<=n ;++i){
        if(dp[i] == INF) continue;

        for(long j=2L*i; j<=1L*i*i && j<=n; j+=i){
          int val = (int)j;

          dp[val] = Math.min(dp[val] , (dp[i] + dp[val/i]));
        }
      }

      for(int i=1; i<=n; ++i){
        if(dp[i] == INF){
          System.out.print(-1 + " ");
        }else{

        System.out.print(dp[i] + " ");
        }
      }
      System.out.println();

    }

  }
  
}
