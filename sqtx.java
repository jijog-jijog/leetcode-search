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
                left = mid+1;
            }else if (midsq < x) {
                ans = mid;
                break;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}




// if (midsq < x) {
//     ans = mid;        // Store the floor value
//     left = mid + 1;   // Move to the right half
// } else {
//     right = mid - 1;  // Move to the left half
// }

// 1 2 3 4   |   5 6 7 8