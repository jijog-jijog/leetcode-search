public class sqtx {
    public static void main(String[] args) {
        int x = 8;

        int right = x;

        while(right <= x){
            int left = 1;
            int mid = left + (x - left)/2;
            if (mid == right){
                System.out.println(mid);
            } else if (mid < right) {
                left += 1;
            }else {
                left++;
            }
        }
    }
}
