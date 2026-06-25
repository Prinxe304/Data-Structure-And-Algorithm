import java.util.*;

public class C {
  static int m;
  static int[] connect;
  static List<Integer> weight = new ArrayList<>();

  static boolean dfs(int pos, int last, int diff) {
    if (pos == m) {
      return true;
    }

    for (int w : weight) {
      if (w == last) continue;
      if (w <= diff) continue;

      if (w > diff) {
        connect[pos] = w;
      }

      if (dfs(pos + 1, w, w - diff)) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    m = sc.nextInt();
    connect = new int[m];

    for (int i = 0; i < s.length(); ++i) {
      if (s.charAt(i) == '1') {
        weight.add(i + 1);
      }
    }

    if (dfs(0, -1, 0)) {
      System.out.println("YES");
      for (int i = 0; i < connect.length; ++i) {
        System.out.print(connect[i] + " ");
      }
    } else {
      System.out.println("NO");
    }
  }
}
