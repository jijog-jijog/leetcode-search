public class minimumrotatedarray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int left = 0;
        int right = nums.length-1;
        int small = nums[0];

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[left] <= nums[mid]) {
                if (nums[mid] < small) {
                    small = nums[mid];
                }
            
        }
        }
    }
}
