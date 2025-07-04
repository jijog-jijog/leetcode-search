public class sortedtwosum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = null;
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i] + nums[j] == target) {
                 res =  new int[]{i,j};
                }
            }
        }
    for(int a : res){
        System.out.println(a);
    }
    }
}
