
import java.util.Arrays;

public class dupli {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,2,3,3,4,4,5,5};

         int[] op = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if (i+1 <= nums.length-1) {
                nums[i+1] = op[i];
            }

            

    }

    System.out.println(Arrays.toString(op));
}
}