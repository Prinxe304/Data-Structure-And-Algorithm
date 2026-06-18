import java.util.*;

public class A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    List<Long> list = new ArrayList<>();

    for (long t = 1; ; ++t) {
      long k = (t * (t + 1)) / 2;
      if (k > n) break;
      list.add(k);
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
