public class sqtx {
    public static void main(String[] args) {
       int x = 8;
       int left = 0;
       int right = x;
       int ans = 0;
        
       while (left <= right) {
        int mid = (left + right)/2;
        long midsq = (long)mid*mid;
        if (midsq < x) {
            ans = mid;
            left = mid + 1;
        }else if (midsq > x) {
             right = mid-1;
        }
       }
    System.out.println(ans);
    }
}