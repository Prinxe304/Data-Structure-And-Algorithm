import java.util.*;

public class A{

  static int[][] dir = {{0,1} , {0,-1} , {1,0} , {-1,0}};

  public static int solve(int[][] mat, int r , int c){

    int step= 0;

    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{r,c});
    mat[r][c] = -1;
    while(!q.isEmpty()){
      int size = q.size();
      while(size-- > 0){

        int[] cur = q.poll();
        r = cur[0];
        c = cur[1];
        mat[r][c] = -1;
        if(r == 2 && c == 2){
          return step;
        }

        for(int[] d : dir){ 
          int nr = r + d[0];
         int nc = c + d[1];

        if (nr >= 0 && nr < 5 && nc >= 0 && nc < 5 && mat[nr][nc] != -1) {
                  q.add(new int[]{nr,nc});
          }
        }

      }
      step++;
    }

    return step;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] mat = new int[5][5];
    int idx = -1;
    int idxx = -1;
    for(int i=0; i<5; ++i){
      for(int j=0; j<5; ++j){
        mat[i][j] = sc.nextInt();
        if(mat[i][j] == 1){
          idx = i;
          idxx = j;
        }
      }
    }

    System.out.println(solve(mat , idx ,idxx));

  }


}
