public class minimumrotatedarray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int left = 0;
        int right = nums.length-1;
        int small = nums[0];

        while (left <= right) {
            int mid = left + (right - left)/2;
            // if (nums[left] <= nums[mid]) {
                if (nums[mid] < small) {
                    small = nums[mid];
                    right = mid-1;
                }else{
                    left = mid + 1;
                }  
        // }
        }
        // int left0 = 0;
        // int right0 = nums.length-1;
        // int mid2 = left0+(right0 - left0 )/2;
        // if (nums[mid2] >= nums[right]) {
        //     int left2 = mid2;
        //     int right2 = nums.length-1;
        //     while (left2 <= right2) {
        //         int mid = left2 + (right2 - left2);
        //         if (nums[mid] < small) {
        //             small = nums[mid];
        //             left = mid + 1;
        //         }else{
        //             right = mid - 1;
        //         }
        //     }
        // }
    System.out.println(small);
    }
}
