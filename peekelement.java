public  class peekelement {

    public static void main(String[] args) {
        int nums[] = {2,4,6,7,5,4,2};

        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (nums[mid] < nums[mid + 1]) {
                 left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        System.out.println(nums[left]);
    }
}