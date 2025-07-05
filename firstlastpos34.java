import java.util.ArrayList;
import java.util.List;

public class firstlastpos34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int ansleft = -1;
        int ansright = -1;

        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                ansleft = mid;
                left = mid + 1;
            }else if (nums[mid] > target) {
                right = mid - 1;
            }else if (nums[mid] < target) {
                left = left + 1;
            }
        }

        int rleft = 0;
        int rright = nums.length-1;

        while (rleft <= rright) {
            int mid = rleft + (rright - rleft)/2;
            if (nums[mid] == target) {
                ansright = mid;
                rright = mid + 1;
            }else if (nums[mid] > target) {
                rright = mid + 1;
            } else {
                rleft = mid + 1;
            }
        }

    int[] op = {ansleft,ansright};
    for(int a : op){
        System.out.println(a);
    } 
       
    }
}
