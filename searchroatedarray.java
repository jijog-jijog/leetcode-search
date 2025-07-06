public class searchroatedarray {
    public static void main(String[] args) {
        int[] nums = {  4   ,    5  ,  6 ,  7 ,   0   , 1  ,  2 } ;
        int target = 7;

        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        while (left <= right) {
           int mid = left + (right - left)/2; 
           if (target >= nums[left] && nums[mid] >= target) {
                if (nums[mid] > target) {
                    right = mid - 1;
                }else if (nums[mid] < target) {
                    ans = mid;
                    left = mid +1;
                }
           }else{
            if (nums[mid] > target) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
           }

        }
    System.out.println(ans);
    }
}
