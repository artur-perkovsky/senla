package senla.test.task.utils;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {

    /**
     * @param number type Long the number to be parsed
     * if the number is divisible (except for 1 and itself)
     * the counter is incriminated
     * @return String response line
     */
    public static String searchSimple(Long number) {

        int count = 0;

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) return "Simple";
        else return "Complex";
    }

    /**
     *
     * @param number type Long the number to be parsed
     * if the number 2 is divisible by 2 without a remainder - it is even
     * @return String response line
     */
    public static String searchEven(Long number) {
        if (number % 2 == 0) return "Even";
        else return "Odd";
    }

    /**
     *
     * @param first type Long the number to be parsed
     * @param second type Long the number to be parsed
     *
     * @return result type Long
     */

    public static Long greatestCommonFactor(Long first, Long second){
        while (first != 0 & second != 0){
            if (first > second){
                first %= second;
            }else{
                second %= first;
            }

        }
        return first + second;
    }

    /**
     *
     * @param first type Long the number to be parsed
     * @param second type Long the number to be parsed
     *
     * @return result type Long
     */

    public static Long leastCommonMultiple(Long first, Long second) {
        return first * second / greatestCommonFactor(first, second);
    }

    /**
     *
     * @param sequence sequence type Long to be parsed
     * turn the resulting number from the sequence
     * compare it with the original
     * if equal, write to the list the name palindromes
     * @return list palindromes numbers type Long
     */
    public static List<Long> getPalindromes(List<Long> sequence) {

        List<Long> palindromes = new ArrayList<>();

        for (Long number : sequence) {

            Long target = number;
            Long reversed = 0L;

            while (target != 0) {
                Long remainder = target % 10;
                reversed = reversed * 10 + remainder;
                target = target / 10;
            }

            if (reversed == number) {
                palindromes.add(number);
            }
        }
        return palindromes;

    }


}
