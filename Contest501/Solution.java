import java.util.*;

class Solution {

  /*
   *
   *  count all string in queue
   *  using hashmap
   *
   *
   */

  public int[] countWordOccurrences(String[] chunks, String[] queries) {

    Queue<String> q = new LinkedList<>();
    HashMap<String, Integer> map = new HashMap<>();
    StringBuffer sb = new StringBuffer();

    for (String ch : chunks) {

      sb.append(ch);
    }

    String ch = sb.toString();
    sb = new StringBuffer();

    for (int i = 0; i < ch.length(); ++i) {
      char c = ch.charAt(i);
      // System.out.println(c);
      if ((c - 'a') >= 0 && (c - 'z') <= 26) {
        sb.append(c);
      } else if (c == '-'
          && (i - 1) >= 0
          && (i + 1) <= ch.length() - 1
          && (ch.charAt(i - 1) - 'a' >= 0)
          && (ch.charAt(i + 1) - 'a' <= 26)) {
        sb.append(c);
      } else {
        if (sb.length() > 0) {
          System.out.println(sb.toString());
          q.add(sb.toString());
          sb = new StringBuffer();
        }
      }
    }

    if (sb.length() > 0) {
      q.add(sb.toString());
    }

    while (!q.isEmpty()) {
      String s = q.poll();
      map.put(s, map.getOrDefault(s, 0) + 1);
    }

    // queries
    int[] ans = new int[queries.length];
    for (int i = 0; i < queries.length; ++i) {
      if (map.containsKey(queries[i])) {
        // System.out.println(map.get(queries[i]));
        ans[i] = map.get(queries[i]);
      } else {
        ans[i] = 0;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    String[] chunks = new String[n];
    for (int i = 0; i < n; i++) {
      chunks[i] = sc.nextLine();
    }

    int n2 = sc.nextInt();
    sc.nextLine();
    String[] queries = new String[n2];
    for (int i = 0; i < n2; i++) {
      queries[i] = sc.nextLine();
    }

    Solution sol = new Solution();
    int[] ans = sol.countWordOccurrences(chunks, queries);
    for (int i = 0; i < ans.length; ++i) {

      System.out.println(ans[i]);
    }

    sc.close();
  }
}
