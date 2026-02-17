import java.util.*;


public class C{
// Problem C
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-- > 0){
      int n = sc.nextInt();

      int[] a = new int[n];
      for(int i=0; i<n; ++i){
        a[i] = sc.nextInt();
      }
Arrays.sort(a);

            // Answer = longest length of consecutive distinct values in original array
            int best = 1, cur = 1;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) continue;          // ignore duplicates
                if (a[i] == a[i - 1] + 1) cur++;         // extend run
                else cur = 1;                            // start new run
                if (cur > best) best = cur;
            }

      System.out.println(best);



    }

  }
  
}
