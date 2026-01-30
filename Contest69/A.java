import java.util.*;


public class A{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    int xi = 0 , yi = 0 , zi = 0;

    while (t-- > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();
      xi += x;
      yi += y;
      zi += z;
    }

    if(xi==0 && yi==0 && zi==0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

  }
  
}
