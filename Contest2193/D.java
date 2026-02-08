import java.util.*;

public class D{

    public static int binary(long[] pre, int utility) {
        int start = 1;
        int end = pre.length - 1;
        int best = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (pre[mid] <= utility) {
                best = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return best;
    }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while(t-- > 0){

      int n = sc.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      long[] pre = new long[n+1];

      for(int i=0; i<n; ++i){
        a[i] = sc.nextInt();
      }

      Arrays.sort(a);
      for(int i=0; i<n; ++i){
        b[i] = sc.nextInt();
      }
for (int i = 1; i <= n; i++) {
                pre[i] = pre[i - 1] + b[i - 1];
            }

            long sum = 0;

      for(int i=0; i<n; ++i){

        if(i > 0 && a[i] == a[i-1]) continue;

        int x = a[i];
        int utility = n - i;

        int levels = binary(pre , utility);
  
        sum = Math.max(sum , (long)x * levels);

      }

      System.out.println(sum);
    }

  }
  
}
