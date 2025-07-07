public class peek {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int left = 0;
        int right = nums.length-1;
        int peek = 0;

        while (left < right ) {
            int mid = left + (right - left)/2;
            if (nums[mid] > nums[peek] ) {
                peek = mid;
                left = mid + 1;
            }else{
                 right = mid - 1;
            }
        }
        System.out.println(peek);
    }
}
