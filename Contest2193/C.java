import java.util.*;

public class C{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while(t-- > 0){
      int n = sc.nextInt();
      int q = sc.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      int[] c = new int[n];
      int[] count = new int[n];

      for(int i=0; i<n; ++i){
        a[i] = sc.nextInt();
      }
      for(int i=0; i<n; ++i){
        b[i] = sc.nextInt();
      }


      for(int i=0; i<n; ++i){
        c[i] = Math.max(a[i] , b[i]);
      }

count[n-1] = c[n-1];

for(int i = n-2; i >= 0; i--){
    count[i] = Math.max(c[i], count[i+1]);
}

      long[] sufix = new long[n];
      sufix[0] = (long)count[0];

      for(int i=1; i<n; ++i){
        sufix[i] = sufix[i-1] + count[i];
      }

      while(q-- > 0){
      int l = sc.nextInt();
      int r = sc.nextInt();
        int sum = 0;
        System.out.print(sufix[r-1] - ((l > 1) ? sufix[l-2] : 0) + " ");
      }
      System.out.println();
    }

  }
  
}
