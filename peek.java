public class peek {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int left = 0;
        int right = nums.length-1;
        int peek = 0;

        while (left <= right ) {
            int mid = left + (right - left)/2;
            if (nums[left] > nums[mid] ) {
                peek = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(peek);
    }
}
