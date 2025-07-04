public class sqtx {
    public static void main(String[] args) {
        int x = 8;
        int left = 0;
        int right = x;
         int ans =0;

        while(left <= right){
            
            int mid = left + (right - left)/2;
            long midsq = (long)mid*mid;
            if (midsq == x){
                ans = mid;
                break;
            } else if (midsq > x) {
                midsq--;
            }else if (midsq < x) {
                ans = mid;
                break;
            }
            else {
                midsq++;
            }
        }
        System.out.println(ans);
    }
}
