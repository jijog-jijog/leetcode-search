import java.util.ArrayList;
import java.util.List;

public class interof2array {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        
        List<Integer> ans = new ArrayList<>();
        int[] res = new int[ans.size()];
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j])
                ans.add(i);
            }
        }
    for(int i = 0; i < ans.size(); i++){
        res[i] = ans.get(i);
    }


    }
}
