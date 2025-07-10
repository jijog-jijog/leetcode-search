public class infinitearray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6,7,9,12,15};
        int target = 9;

        int left = 0;
        int right = 1;
        int ans = -1;

       
        while (target > nums[right]) {
            int temp = right;
              right = right+(right - left + 1) *2;
              left = temp + 1;

        }
        while (left <= right) {
            int mid = left +(right - left)/2;
            if (nums[mid] == target) {
                ans = mid;
                left = mid -1;
            }if (nums[mid] >= target) {
                right = mid - 1;
            }else if (nums[mid] <= target) {
                left = mid + 1;
            }
        }
        System.out.println(ans);
        System.out.println(nums[5]);
    }
}
