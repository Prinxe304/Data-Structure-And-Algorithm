import java.util.*;

class D {

  static void build(int node, int start, int end, int[] tree, int[] arr, boolean isOr) {
    if (start == end) {
      tree[node] = arr[start];
      return;
    }

    int mid = (start + end) / 2;

    build(2 * node, start, mid, tree, arr, !isOr);
    build(2 * node + 1, mid + 1, end, tree, arr, !isOr);

    if (isOr) {
      tree[node] = tree[2 * node] | tree[2 * node + 1];
    } else {
      tree[node] = tree[2 * node] ^ tree[2 * node + 1];
    }
  }

  static void update(
      int node, int start, int end, int idx, int val, int[] tree, int[] arr, boolean isOr) {
    if (start == end) {
      tree[node] = val;
      return;
    }

    int mid = (start + end) / 2;
    if (idx <= mid) {
      update(2 * node, start, mid, idx, val, tree, arr, !isOr);
    } else {
      update(2 * node + 1, mid + 1, end, idx, val, tree, arr, !isOr);
    }

    if (isOr) {
      tree[node] = tree[2 * node] | tree[2 * node + 1];
    } else {
      tree[node] = tree[2 * node] ^ tree[2 * node + 1];
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Input n and m
    int n = sc.nextInt();
    int m = sc.nextInt();

    // Array size = 2^n
    int size = 1 << n;

    int[] arr = new int[size];

    // Array input
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int[] tree = new int[4 * size];
    boolean isOr = (n % 2 == 1);

    build(1, 0, size - 1, tree, arr, isOr);
    int[] ans = new int[m];

    // Queries
    for (int i = 0; i < m; i++) {

      int p = sc.nextInt();
      int b = sc.nextInt();

      // Example update
      arr[p - 1] = b;
      update(1, 0, size - 1, p - 1, b, tree, arr, isOr);
      ans[i] = tree[1];
      // You can process query here
    }

    for (int c : ans) {

      System.out.println(c + " ");
    }

    sc.close();
  }
}
