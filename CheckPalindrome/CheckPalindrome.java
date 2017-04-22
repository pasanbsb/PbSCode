/**
 * Created by Pasan on 7/21/2016.
 */
public class CheckPalindrome {

    /**
     * Is palindrome boolean.
     *
     * @param input the input
     * @return the boolean
     */
    public static boolean isPalindrome(String input) {
        // remove all special characters
        input = input.replaceAll("\\W","").toLowerCase();

        int n = input.length();

        // check first and last characters are same, and work towards inside
        for (int i = 0; i < (n / 2); ++i) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
