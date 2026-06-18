import java.util.*;

public class Binary {

  /*
   * n <= 10^9 -> can not use the brute-force
   * optimal solution using the binary
   * Time Complexity :
   *  (t * (t + 1)) -> t^2 + t < n
   *
   *  t^2 <= n
   *  t <= n^1/2
   *
   *
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    List<Long> list = new ArrayList<>();
    for (long t = 1; ; ++t) {
      long v = (t * (t + 1)) / 2;
      if (v > n) break;
      list.add(v);
    }

    int l = 0;
    int r = list.size() - 1;

    while (l <= r) {
      long sum = list.get(l) + list.get(r);
      if (sum == n) {
        System.out.println("YES");
        return;
      }
      if (sum < n) {
        l++;
      } else {
        r--;
      }
    }

    System.out.println("NO");
  }
}
