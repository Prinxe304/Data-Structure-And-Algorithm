import java.util.*;

public class A{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    int m = 3;
    int n = 3;
    int[][] bulb = {{1,1,1} , {1,1,1} , {1,1,1}};
    int[][] light = new int[3][3];
    for(int i=0; i<m; ++i){
      for(int j=0; j<n; ++j){
        light[i][j] = sc.nextInt();
      }
    }
    int[][] dir = {{1,0} , {-1,0} , {0,1} , {0,-1}};

     for(int i=0; i<m; ++i){
      for(int j=0; j<n; ++j){
        if(light[i][j] %2 != 0){
          bulb[i][j] = 1 - bulb[i][j];
          for(int[] d : dir){
            int nr = i + d[0];
            int nc = j + d[1];
            if(nr >= 0 && nr < 3 && nc >= 0 && nc < 3){
              bulb[nr][nc] = 1 - bulb[nr][nc];
            }
          }
        }
      }
    }


    for(int i=0; i<m; ++i){
      for(int j=0; j<n; ++j){
        System.out.print(bulb[i][j]);
      }
      System.out.println();
    }

  } 
}
