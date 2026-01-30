
import java.util.*;

public class  B{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
    int dot = ('.'-'a');
    int minus = ('-'-'a');
    String ans = "";
    int i =0;
    while(i < s.length()){
      char ch = s.charAt(i);
      char ch1 = ' ';
      if(i+1<s.length()){
        ch1 = s.charAt(i+1);
      }

      if((i+1<s.length()) && (ch-'a') == minus && (ch1-'a') == dot){
        ans = ans + "1";
        i+=2;
      }else if( (i+1<s.length()) && (ch-'a') == minus && (ch1-'a') == minus){
        ans = ans + "2";
        i+=2;
      }else{
        ans = ans + "0";
        i+=1;
      }

    }

    System.out.println(ans);

  }
  
}
