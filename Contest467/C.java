import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class C {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    long[] pre = new long[n + 1];
    long[] a = new long[n + 1];
    st = new StringTokenizer(br.readLine());

    pre[0] = 0;
    a[0] = 0;

    for (int i = 1; i <= n; ++i) {
      a[i] = Long.parseLong(st.nextToken());
      pre[i] = pre[i - 1] + a[i];
    }

    long[][] dp = new long[n + 1][k + 1];
    for (long[] d : dp) {
      Arrays.fill(d, 0);
    }

    for (int i = m; i <= n; ++i) {
      long seg = pre[i] - pre[i - m];
      for (int j = 1; j <= k; ++j) {
        dp[i][j] = Math.max(dp[i - 1][j], dp[i - m][j - 1] + seg);
      }
    }

    System.out.println(dp[n][k]);
  }
}
