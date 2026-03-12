import java.util.*;

public class C{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();

    List<Integer> list_value = new ArrayList<>();

    for(int i=0; i<n; ++i){
      list_value.add(sc.nextInt());
    }

    int count_median = 0;

    while(true){
      Collections.sort(list_value);

      int median_value = ((list_value.size()-1)/ 2);

      if(list_value.get(median_value) == x){
        break;
      }

      count_median++;
      list_value.add(x);

    }

    System.out.println(count_median);
  }
  
}
