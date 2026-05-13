import java.util.*;

class Railway {

  public int findPlatform(int[] Arrival, int[] Departure) {
    int n = Arrival.length;

    int[][] rail = new int[n][2];
    for (int i = 0; i < n; ++i) {
      rail[i][0] = Arrival[i];
      rail[i][1] = Departure[i];
    }

    Arrays.sort(rail, (a, b) -> a[1] - b[1]);

    int count = 0;
    boolean[] visit = new boolean[n];
    Arrays.fill(visit, false);
    int platform = 0;
    int end = 0;

    while (count < n) {
      end = 0;
      for (int i = 0; i < n; ++i) {

        if (!visit[i] && rail[i][0] > end) {
          // System.out.println(count);
          count++;
          visit[i] = true;
          end = rail[i][1];
        }
      }
      platform++;
    }

    return platform;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] Arrival = new int[n];
    for (int i = 0; i < n; i++) {
      Arrival[i] = sc.nextInt();
    }

    int n2 = sc.nextInt();
    int[] Departure = new int[n2];
    for (int i = 0; i < n2; i++) {
      Departure[i] = sc.nextInt();
    }

    Railway sol = new Railway();
    int ans = sol.findPlatform(Arrival, Departure);
    System.out.println(ans);

    sc.close();
  }
}
