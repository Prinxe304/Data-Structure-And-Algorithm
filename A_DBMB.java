import java.util.*;


public class A_DBMB{

  static String solve(int n , int s , int x, int[] arr){
    int sum = 0;

    for(int i=0; i<n; ++i){
      sum+= arr[i];
    }

    if (x==1 || sum > s) {
      if(sum > s){
        return "NO";
      }else{
        return "YES";
      }
    }

    int minus = s - sum;

    if(minus % x == 0){
      return "YES";
    }

    return "NO";

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      
    int n = sc.nextInt();
    int s = sc.nextInt();
    int x = sc.nextInt();

    int[] arr = new int[n];

    for(int i=0; i<n; ++i){
      arr[i] = sc.nextInt();
    }

    System.out.println(solve(n , s,x,arr));
    }

  }
}


