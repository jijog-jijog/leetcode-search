public class searchroatedarray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int left = 0;
        int right = nums.length-1;
        System.out.println(right);
        while (left <= right) {
           int mid = left + (right - left)/2; 
           System.out.println(mid);

        }
    }
}
