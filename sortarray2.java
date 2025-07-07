public class sortarray2 {
    public static void main(String[] args) {
        int[] nums = {3,1};
        int target = 0;
        int left = 0;
        int right = nums.length-1;
        boolean ans = false;

        while (left <= right) {
            int mid = left + (right - left )/2;

            if (nums[mid] == target) {
                ans = true;
            }
             if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }
            else if (nums[mid] >= nums[left] ) {
                if (nums[mid] > target) {
                    right = mid - 1;
                }else{
                    left = mid +1;
                }
            }else{
                if (target > nums[mid] && target <= nums[left]) {
                     left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
    System.out.println(ans);
    }
}
