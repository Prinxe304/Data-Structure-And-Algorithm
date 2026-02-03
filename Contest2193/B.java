iimport java.util.*;

public class B{

  static void reverse(int[] arr, int i , int j){
    while(i < j){
      int temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;

      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
    
     while(t-- > 0){
       int n = sc.nextInt();

       int[] arr = new int[n];
       int go = -1;

       for(int i=0; i<n; ++i){
         arr[i] = sc.nextInt();
       }
       int l = n-1;
       int r = n-1;

       int size = arr.length-1;
       while(size-- > 0){
         
         if(arr[r] > arr[l]){
           l = r;
           go = l;
          
         }

         r--;
         size--;
       }
       if(go != -1){
       }else if(arr[l] > arr[0]){
         reverse(arr , 0 , l);
       }else{
         reverse(arr ,1 , l);
       }
     for(int i=0; i<arr.length; ++i){
       System.out.print(arr[i]+ " ");
     }
     System.out.println();
     }

  }
  
}
mport java.util.*;

public class B{

  static void reverse(int[] arr, int i , int j){
    while(i < j){
      int temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;

      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
    
     while(t-- > 0){
       int n = sc.nextInt();

       int[] arr = new int[n];
       int go = -1;

       for(int i=0; i<n; ++i){
         arr[i] = sc.nextInt();
       }
       int l = n-1;
       int r = n-1;

       int size = arr.length-1;
       while(size-- > 0){
         
         if(arr[r] > arr[l]){
           l = r;
           go = l;
          
         }

         r--;
         size--;
       }
       if(go != -1){
       }else if(arr[l] > arr[0]){
         reverse(arr , 0 , l);
       }else{
         reverse(arr ,1 , l);
       }
     for(int i=0; i<arr.length; ++i){
       System.out.print(arr[i]+ " ");
     }
     System.out.println();
     }

  }
  
}
