import java.util.*;

public class B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    boolean[] isPrime = new boolean[1_000_000 + 1];
    long max = 1_000_000;
    Arrays.fill(isPrime, true);

    isPrime[0] = false;
    isPrime[1] = false;

    for(int i=2 ; i*i<=max; ++i){
      if(isPrime[i]){
        for(int j=i*i; j<=max; j+=i){
          if(isPrime[j]){
            isPrime[j]  = false;
          }
        }
      }
    }

    while(n-- > 0){
      long v = sc.nextLong();
      long root = (long)Math.sqrt(v);
      if(root*root == v  && isPrime[(int)root]){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }

  }
  
}
