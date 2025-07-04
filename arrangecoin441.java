public class arrangecoin441 {
    public static void main(String[] args) {
        int n = 1804289383;
        int right = n; //row
        int left = 1; //lowest low
        int ans = 0;

        while ((left <= right)) {
            int mid = left + (right - left)/2;

            long max = (long)mid*(mid + 1)/2;
            if (max == n) {
                ans  = mid;
            }else if (max > n) {
                right = mid - 1;
            }else if (max < n) {
                ans = mid;
                left = mid + 1;
            }
            
        }
    System.out.println(ans);

    }
}
