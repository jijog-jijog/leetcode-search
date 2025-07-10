public class infinitearray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6,7,9,12,15,17,19,20,22,27,38,39,40,50,57,58,60,88,90};
        int target = 27;

        int left = 0;
        int right = 1;

       
        while (nums[left] < target) {
            int temp = right + 1;
              right = right+(right - left + 1) *2;
              left = temp;

        }
        System.out.println(right);
    }
}
