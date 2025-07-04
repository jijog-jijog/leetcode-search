public class smallerletter744 {
    public static void main(String[] args) {
        String[] letters = {"c","f","j"};
        char target = 'a';
        int left = 0;
        int right = letters.length - 1;
        char ans = letters[0].charAt(0);

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (letters[mid].charAt(0) == target) {
                ans = letters[mid].charAt(0);
            }else if (letters[mid].charAt(0) > target ) {
                right = mid - 1;
            }else if(letters[mid])
        }
    }
}
