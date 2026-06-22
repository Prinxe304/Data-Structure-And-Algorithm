import java.util.*;

public class C {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int avg = sc.nextInt();
    int sum = 0;
    int ans = 0;
    Queue<Pair> q = new PriorityQueue<>((a, b) -> Long.compare(a.essay, b.essay));

    for (int i = 0; i < n; ++i) {
      int grade = sc.nextInt();
      int essay = sc.nextInt();
      sum += grade;
      q.add(new Pair(grade, essay));
    }

    if (sum >= n * avg) {
      System.out.println(ans);
      return;
    }

    int remained = (n * avg) - sum;

    while (!q.isEmpty()) {
      Pair pair = q.poll();
      int grade = pair.grade;
      int essay = pair.essay;

      if (remained <= 0) {
        System.out.println(ans);
        return;
      }

      int points = Math.min(remained, (x - grade));
      ans = ans + (points * essay);
      // System.out.println("grade : " + grade + " essay : " +essay + " points : " + points + " ans
      // : " + ans);
      grade += points;
      remained -= points;

      // while(grade < x){
      //   ans += essay;
      //   System.out.println("grade : " + grade + " essay : " +essay );
      //   sum += 1;
      //   grade += 1;
      //   if((sum/n) >= avg){
      //     System.out.println(ans);
      //     return;
      //   }
      // }

    }
    System.out.println(ans);
  }
}

class Pair {
  int grade;
  int essay;

  Pair(int grade, int essay) {
    this.grade = grade;
    this.essay = essay;
  }
}
