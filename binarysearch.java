public class binarysearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        int left = 0;
        int right = nums.length-1;
        int ans = 0;
        while (left <= right) {
           int mid =  left +(left - right)/2;
           if (nums[mid] == target) {
              ans = mid;
              break;
           }else if (nums[mid] > target) {
               right = mid - 1;
           }else if (nums[mid] < target) {
               left = mid + 1;
           }else{
            ans = -1;
           }
        }
    System.out.println(ans);
    }
}
