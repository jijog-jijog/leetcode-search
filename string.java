public class string {
    public static void main(String[] args) {
        char[] arr = {'b','c','f','j','k','l','m'};

        char target = 'a';
        char ans = arr[0];

        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (arr[mid] > target) {
                ans = arr[mid];
                 right = mid -1;
                  
                
            }else {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
