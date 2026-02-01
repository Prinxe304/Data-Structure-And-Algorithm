import java.util.*;


public class A{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    Queue<int[]> q = new LinkedList<>();
    int[] ind = new int[n];

    for(int i=0; i<n; ++i){
      ind[i] = sc.nextInt();
      q.add(new int[]{ind[i], i});
    }

    int trace = 0;
    while(!q.isEmpty()){
      int[] ele = q.poll();
      trace = ele[1];

      if((ele[0] - m) > 0){
        q.add(new int[]{(ele[0] - m), ele[1]});
      }
    }

    System.out.println(trace+1);

  }
  
}
