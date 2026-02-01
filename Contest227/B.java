import java.util.*;

public class  B{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    HashMap<Integer , int[]> mp = new HashMap<>();
    int x = a;
    for(int i=0; i<a;++i){
      mp.put(sc.nextInt() , new int[]{i+1 , x--});
    }

    int b = sc.nextInt();
    int suma = 0;
    int sumb = 0;

    for(int i=0; i< b; ++i){
      int val = sc.nextInt();

      if(mp.containsKey(val)){
        int[] cur = mp.get(val);
        suma += cur[0];
        sumb += cur[1];
      }

    }

    System.out.println(suma + " " + sumb);


  }
  
}
