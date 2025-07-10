public class infinitearray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6,7,9,12,15,17,19,20,22,27,38,39,40,50,57,58,60,88,90};
        int target = 27;

        int left = 0;
        int right = 1;
        int ans =  -1;

       
        while (nums[right] < target) {
            int temp = right +1;
              right = right+(right - left + 1) *2;
              left = temp;

        }
        while (left <= right) {
            int mid = left +(right - left)/2;
            if (nums[mid] == target) {
                ans = mid;
                break;
            }if (nums[mid] > target) {
                right = mid - 1;
            }else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        System.out.println(ans);
        System.out.println(nums[12]);
    }
}
