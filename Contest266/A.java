import java.util.*;

public class  A{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    String s = sc.next();
    int count = 0;

    for(int i=0; i<t-1; ++i){
      char ch = s.charAt(i);
      char ch1 = s.charAt(i+1);

      if((ch-'a') == (ch1-'a')){
        count++;
      }

    }

    System.out.println(count);

  }
  
}
