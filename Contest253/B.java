import java.util.*;

public class B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; ++i) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int maxi = 0;
    int l = 0;

    for (int r = 1; r < n; ++r) {
      while (l < n && a[l] * 2 < a[r]) {
        l++;
      }

      maxi = Math.max(maxi, r - l + 1);
    }

    System.out.println(n - maxi);
  }
}
