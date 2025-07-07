public class peek {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int left = 0;
        int right = nums.length-1;
        int peek = nums[0];

        while (left <= right ) {
            int mid = left + (right - left)/2;
            if (nums[mid] > peek ) {
                peek = nums[mid];
                 left = mid + 1;
            }else{
                 right = mid - 1;
            }
        }
        System.out.println(nums[peek]);
    }
}
