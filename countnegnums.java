import java.util.Arrays;

public class countnegnums {
    public static void main(String[] args) {
         int[][] grid = {{4,3,2,-1},
                      {3,2,1,-1},
                      {1,1,-1,-2},
                      {-1,-1,-2,-3}};
         int count = 0;
         int len = grid.length;
       

        int ans = 0;
         for(int[] a : grid){
            
              int left = 0;
              int right = len -1;
            while (left <= right ) {
                int mid = left + (right - left)/2;
                if (a[mid] < 0) {
                
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            
            }
        ans = ans+ a.length - left;
         }
    
    System.out.println(ans);
}
}
