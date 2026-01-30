import java.util.*;

public class B{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-- > 0){
      int n = sc.nextInt();

      String s = sc.next();

      int one = 0;
      for(char c : s.toCharArray()){
        if(c == '1') one++; 
      }
if (one == 0) {
  System.out.println((n) / 2);
  continue;
}

      int x = 0;
      int y = 0;

      int first = 0;
      for(int i=0; i<n; ++i){
        if(s.charAt(i) == '0'){
          first++;
        }else{
          x = i+1;
          break;
        }
      }

      int back = 0;
      for(int i=n-1; i>=0; --i){
        if(s.charAt(i) == '0'){
          back++;
        }else{
          y = i-1;
          break;
        }
      }

      int[] ans = new int[n];
      int p =0;

      while(x <= y){
        if(s.charAt(x) == '0'){
          x++;
          continue;
        }
        int a = x;
        while(a < n && s.charAt(a) == '0') a++;
        int len = a - x;

        ans[p++] = len;

        x = a;

      }

      int total = 0;


      for(int i=0; i<p; ++i){
        total += ((ans[i]-1)/3);
      }

      total += one;
      total += (((first+1)/3) + ((back+1)/3));
      System.out.println(total);
    }


  }
}
