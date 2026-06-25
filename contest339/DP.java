import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class DP {

  static int[] tree;

  static void build(int[] a, int[] tree, int node, int l, int r, boolean isOr) {
    if (l == r) {
      tree[node] = a[l];
      return;
    }
    int mid = (l + r) / 2;
    build(a, tree, 2 * node + 1, l, mid, !isOr);
    build(a, tree, 2 * node + 2, mid + 1, r, !isOr);

    if (isOr) {
      tree[node] = tree[2 * node + 1] | tree[2 * node + 2];
    } else {
      tree[node] = tree[2 * node + 1] ^ tree[2 * node + 2];
    }
  }

  static void query(int[] a, int[] tree, int node, int l, int r, int idx, int v, boolean isOr) {
    if (l == r) {
      tree[node] = v;
      return;
    }

    int mid = (l + r) / 2;
    if (mid >= idx) {
      query(a, tree, 2 * node + 1, l, mid, idx, v, !isOr);
    } else {
      query(a, tree, 2 * node + 2, mid + 1, r, idx, v, !isOr);
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

    build(a, tree, 0, 0, n - 1, isOr);

    for (int i = 0; i < q; ++i) {
      st = new StringTokenizer(br.readLine());
      int idx = Integer.parseInt(st.nextToken());
      int val = Integer.parseInt(st.nextToken());
      query(a, tree, 0, 0, n - 1, idx - 1, val, isOr);
      System.out.println(tree[0]);
    }
  }
}
