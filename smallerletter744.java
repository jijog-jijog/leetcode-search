public class smallerletter744 {
    public static void main(String[] args) {
        char[] letters = {'c' , 'f' , 'j'};
        char target = 'c';
        int left = 0;
        int right = letters.length - 1;
        char ans = letters[0];

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (letters[mid] > target) {
                ans = letters[mid];
                 right = mid - 1;

            }else{
                   left = mid + 1;

            }
            }
        }
    System.out.println(ans);
    }
}
