
import java.util.*;

public class B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();

    String s = sc.next();
    StringBuilder sb = new StringBuilder(s);

    while (t-- > 0) {

      for(int i=0; i<s.length()-1; ++i){
        if((sb.charAt(i)-'a') == ('B' - 'a') && (sb.charAt(i+1)-'a') == ('G' - 'a')){
          char temp = (sb.charAt(i));
          sb.setCharAt(i, (sb.charAt(i+1)));
          sb.setCharAt(i+1, temp);
          i+=1;
        }
      }

    }

    System.out.println(sb.toString());

  }
}
