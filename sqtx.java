public class sqtx {
    public static void main(String[] args) {
       int x = 12;
       int left = 0;
       int right = x;
       long ans = 0;
        
       while (left >= right) {
        int mid = (left + right)/2;
        long midsq = (long)mid*mid;
        if (midsq < x) {
            mid = ans;
            left = mid + 1;
        }else if (midsq > x) {
             right = mid-1;
        }
       }
    System.out.println(ans);
    }
}