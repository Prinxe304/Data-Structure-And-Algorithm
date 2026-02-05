import java.util.*;
/*
 *
 * 1 0 0 1 0
 *
 * count Zero = 0 1 2 2 3
 * count one = 1 1 1 2 2
 *            -1 0 1 0 1
 *
 *      Again 1 1 1 0 1
 *       one  1 2 3 3 4
 *
 *
 */

public class A {

  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    int n  =sc.nextInt();

    int one = 0;
    int zero = 0;
    int[] arr = new int[n];
    int[] zeros = new int[n];
    int[] ones = new int[n];
    int count = 0;
    int maxi = -1;
    for(int i=0; i<n; ++i){
      int val = sc.nextInt();

      if(val == 1){
        one++;
        count--;
      }else{
        count++;
      }

      if(count < 0){
        count = 0;
      }else{
        maxi = Math.max(maxi , count);
      }

    }

    System.out.println(maxi+one);

  }
  
}
