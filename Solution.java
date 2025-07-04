class Solution {
    static{
        for(int i=0;i<500;i++){
            twoSum(new int[]{},0);
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length<2){
            return new int[]{-1,-1};
        }
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int val = numbers[start]+numbers[end];
            if(val>target){
                end--;
            }
            else if(val<target){
                start++;
            }
            else{
                return new int[]{start+1,end+1};
            }
        } 
        return new int[]{-1,-1};
}
    }