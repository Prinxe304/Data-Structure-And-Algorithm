import java.util.*;

public class A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-- > 0){
      int x= sc.nextInt();
      

      int[] ans = new int[x];
      int i=1; 
      int j=x;
      x--;
      while(x >= 0){
        if(x >= 0){

        ans[x--] = i;
        }else{
          break;
        }

        if(x>=0){
        ans[x--] = j;
        }else{
          break;
        }

        i++;
        j--;
      }

      for(int k=0; k<ans.length; ++k){
        System.out.print(ans[k] + " ");
      }
      System.out.println();

    }


    sc.close();

  }
}
