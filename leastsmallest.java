public class leastsmallest {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        int target = 15;
        int left = 0;
        int right = arr.length-1;
        int ans = 0;

        while (left < right) {
            int mid = left+(right - left)/2;
            if (arr[mid] < target || arr[mid] == target) {
                left = mid + 1;
                ans = arr[mid];
                
            }else if (arr[mid] > target) {
                right = mid-1;
            }
        }
        System.out.println(ans);
    }
}
