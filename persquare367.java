public class persquare367 {
    public static void main(String[] args) {
        int num = 9;
        boolean ans = true;
        int left = 0;
        int right = num;
        int res = 0;

        while ((left <= right)) {
            int mid = left + (right - left)/2;
            long tar = (long)mid*mid;
            if (tar == num) {
                 res = mid;
                 break;
            }else if (tar > num ) {
                right = mid - 1;
            }else if(tar < num){
                res = mid;
                left = mid + 1;
            }
        }
    if (res*res != num) {
        ans = false;
    }
    System.out.println(ans);
    }
}
