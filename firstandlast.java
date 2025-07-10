public class firstandlast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int left = 0;
        int right = nums.length - 1;
        int anslef = -1;

        while(left < right){
            int mid = left + (right - left)/2;

            if (nums[mid] == target) {
                anslef = mid;
                right = mid - 1;
            }else if (nums[mid] >= target) {
                 right = mid - 1;
                
            }else{
               left = mid + 1;
            }
        }

        int rleft = 0;
        int rright = nums.length - 1;
        int rans = -1;
        while (rleft < rright){
            int mid = rleft + (rright - rleft)/2;
            if (nums[mid] == target) {
                rans = mid;
                rleft = mid + 1;
                
            }else if (nums[mid] <= target) {
                rleft = mid + 1;
               
            }else{
                 rright = mid -1;
            }
        } 

        System.out.println(anslef);
        System.out.println(rans);
            
    }
}
    