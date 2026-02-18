import java.util.*;

public class B{
// 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-- > 0){
      int n = sc.nextInt();
      int[] arr = new int[n];
      int maxi = 0;

      for(int i=0; i<n; ++i){
        arr[i] = sc.nextInt();
        maxi = Math.max(maxi , arr[i]);
      }

      int[] pre = new int[n];
      int sum = arr[0];
      pre[0] = arr[0];

      for(int i=1; i<n; ++i){
        pre[i] = Math.max(arr[i] , pre[i-1]);
        sum += pre[i];
      }

      System.out.println((maxi * n));

    }
  }
  
}
