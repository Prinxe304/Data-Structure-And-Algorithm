import java.io.*;
import java.io.InputStreamReader;
import java.util.*;

public class Dpra {

  static int[] tree;

  static void build(int[] tree, int[] a, int node, int s, int e, int n, boolean isOr) {
    if (s == e) {
      tree[node] = a[s];
      return;
    }

    int mid = (s + e) / 2;
    build(tree, a, 2 * node + 1, s, mid, n, !isOr);
    build(tree, a, 2 * node + 2, mid + 1, e, n, !isOr);

    if (isOr) {
      tree[node] = tree[2 * node + 1] | tree[2 * node + 2];
    } else {
      tree[node] = tree[2 * node + 1] ^ tree[2 * node + 2];
    }
  }

  static void update(
      int[] tree, int[] a, int node, int l, int r, int n, boolean isOr, int idx, int v) {
    if (l == r) {
      tree[node] = v;
      return;
    }

    int mid = (l + r) / 2;
    if (idx <= mid) {
      update(tree, a, 2 * node + 1, l, mid, n, !isOr, idx, v);
    } else {
      update(tree, a, 2 * node + 2, mid + 1, r, n, !isOr, idx, v);
    }

    if (isOr) {
      tree[node] = tree[2 * node + 1] | tree[2 * node + 2];
    } else {
      tree[node] = tree[2 * node + 1] ^ tree[2 * node + 2];
    }
  }

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());

    boolean isOr = (n % 2 == 1);
    n = 1 << n;
    int[] a = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; ++i) {
      a[i] = Integer.parseInt(st.nextToken());
    }

    tree = new int[4 * n];
    build(tree, a, 0, 0, n - 1, n, isOr);

    for (int i = 0; i < q; ++i) {
      st = new StringTokenizer(br.readLine());
      int idx = Integer.parseInt(st.nextToken());
      int value = Integer.parseInt(st.nextToken());
      update(tree, a, 0, 0, n - 1, n, isOr, idx - 1, value);
      System.out.println(tree[0]);
    }
  }
}
