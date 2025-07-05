public class findsingleelement {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};

        int left = 0;
        int right = nums.length-1;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] !=  nums[mid + 1]) {
                ans = nums[mid];
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
    System.out.println(ans);
    }
}
