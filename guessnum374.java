import java.util.Scanner;

public class guessnum374 {

    public static void main(String[] args) {
        int n = 10;
        int left  = 0;
        int right = n;
        int ans = 0;

        while(left<=right){
            int mid = left + (right - left)/2;
            Scanner scan = new Scanner(System.in);
            int result = scan.nextInt();
            if (result == 0) {
                ans = mid;
                break;
            }else if (result == -1) {
                right = mid -1;
            }else if (result == 1) {
                left = mid + 1;
            }
        }
    System.out.println(ans);
    }
}

