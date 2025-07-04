public class sqtx {
    public static void main(String[] args) {
       int x = 12;
       int left = 0;
       int right = x;
       long ans = 0;
        
       while (left >= right) {
        int mid = x/2;
        long midsq = (long)mid*mid;
        if (midsq < x) {
            ans = midsq;
            left = mid + 1;
        }else{
            right = mid-1;
        }
       }
    System.out.println(ans);
    }
}