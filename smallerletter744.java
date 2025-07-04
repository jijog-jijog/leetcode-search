public class smallerletter744 {
    public static void main(String[] args) {
        char[] letters = {'c' , 'f' , 'j'};
        char target = 'f';
        int left = 0;
        int right = letters.length - 1;
        char ans = letters[0];

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (letters[mid] > target) {
                ans = letters[mid];
                 right = mid - 1;

            }else if(letters[mid] < target){
                left = mid + 1;

            }else{
                ans = letters[0];
                break;
            }
        }
    System.out.println(ans);
    }
}
