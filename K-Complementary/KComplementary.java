import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pasan on 7/21/2016.
 */
public class KComplementary {

    /**
     * Gets kc pairs.
     *
     * @param numbers the numbers
     * @param k       the k
     * @return the kc pairs
     */
    public static int getKCPairs(int[] numbers, int k) {
        if (numbers.length < 2) {
            return -1;
        }
        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length - 1;
        int count = 0;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == k) {
                System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
                left = left + 1;
                right = right - 1;
                count ++;
            } else if (sum < k) {
                left = left + 1;
            } else if (sum > k) {
                right = right - 1;
            }
        }

        return count;
    }
}

