public class sortedtwosum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = null;
        
        for(int i=1; i<nums.length - 2; i++){
            for(int j=i+1; j<nums.length - 2; j++){
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
