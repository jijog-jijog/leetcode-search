public class Solution1095 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1};
        
        int left = 0;
        int right = arr.length - 1;
        int FH = left;
        int target = 3;
        int ans = -1;

        while (left <= right) {
            int mid= left + (right - left)/2;

            if (arr[mid] > arr[mid + 1]) {
                FH = left;
                right = mid - 1;
                
            }else{
                left = mid + 1;
            }
        }
        System.out.println(FH);

        int lleft = 0;
        int lright = FH;

        while (lleft <= lright) {
            int mid = lleft +(lright - lleft)/2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            }else if (arr[mid] > target) {
                lright = mid - 1;
            }else{
                lleft = mid + 1;
            }
        }

       

        if (ans == -1) {
            int l = FH + 1;
            int r = arr.length - 1;

            while (l < r) {
                int mid = l +(r - l)/2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            }else if (arr[mid] > target) {
                r = mid - 1;
            }else{
                l = mid + 1;
            }
            }
        }
         System.out.println(ans);

    }
}
