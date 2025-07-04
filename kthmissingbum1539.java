public class kthmissingbum1539 {
    public static void main(String[] args) {
        int[] arr ={2,3,4,7,11};
        int k = 5;
        int ans = 0;
        int left =  0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            int res = arr[mid] - mid;
            if (res < k ) {
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
    System.out.println(ans);
        }
    }

