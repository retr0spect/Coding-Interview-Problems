import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Created by Aditya on 8/14/2018.
 */
public class Problems {

    // {1, 9, 9} --> {2, 0, 0}
    // {1, 2, 9} --> {1, 3, 0}
    // {9, 9, 9} --> {1, 0, 0, 0}
    static List<Integer> incrementArrayOfInts(List<Integer> array) {
        int size = array.size() - 1;
        array.set(size, array.get(size) + 1);
        for (int i = size; i > 0 && array.get(i) == 10; i--) {
            array.set(i, 0);
            array.set(i - 1, array.get(i - 1) + 1);
        }
        if (array.get(0) == 10) {
            array.set(0, 0);
            array.add(0, 1);
        }
        return array;
    }

    static List<Integer> deleteDuplicates(List<Integer> array) {
        int writeIndex = 1;
        for (int i = 1; i < array.size(); i++) {
            if (!array.get(writeIndex - 1).equals(array.get(i))) {
                array.set(writeIndex, array.get(i));
                writeIndex++;
            }
        }
        for (int i = writeIndex; i < array.size(); i++) {
            array.set(i, 0);
        }
        return array;
    }

    static int maxStockProfit(List<Integer> prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (Integer price : prices) {
            maxProfit = Math.max(price - minPrice, maxProfit);
            minPrice = Math.min(minPrice, price);
        }
        return maxProfit;
    }

    static List<Integer> allPrimesBrute(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n < 2) {
            return null;
        }
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }

    static List<Integer> allPrimesSieve(int n) {
        List<Integer> primes = new ArrayList<>();
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n + 1, true));
        isPrime.set(0, false);
        isPrime.set(1, false);

        for (int i = 2; i <= n; ++i) {
            if (isPrime.get(i)) {
                primes.add(i);
                for (int j = i; j <= n; j += i) {
                    isPrime.set(j, false);
                }
            }
        }
        return primes;
    }

    static List<Integer> spiralOrder(List<List<Integer>> matrix) {
        List<Integer> spiralOrder = new ArrayList<>();
        int matrixSize = matrix.size();
        for (int i = 0; i < Math.ceil(matrixSize * 0.5); ++i) {
            if (i == matrixSize - i - 1) {
                spiralOrder.add(matrix.get(i).get(i));
            }
            for (int j = i; j < matrixSize - i - 1; ++j) {
                spiralOrder.add(matrix.get(i).get(j));
                spiralOrder.add(matrix.get(j).get(matrixSize - i - 1));
            }
            for (int j = matrixSize - i - 1; j > i; --j) {
                spiralOrder.add(matrix.get(matrixSize - i - 1).get(j));
                spiralOrder.add(matrix.get(j).get(i));
            }
        }
        return spiralOrder;
    }

    static void rotation2d(List<List<Integer>> matrix) {
        for (int i = 0; i < Math.ceil(matrix.size() * 0.5); i++) {
            for (int j = i; j < matrix.size() - 1 - i; j++) {
                int pos1 = matrix.get(i).get(j);
                int pos2 = matrix.get(j).get(matrix.size() - 1 - i);
                int pos3 = matrix.get(matrix.size() - 1 - i).get(matrix.size() - 1 - j);
                int pos4 = matrix.get(matrix.size() - 1 - j).get(i);

                matrix.get(i).set(j, pos4);
                matrix.get(j).set(matrix.size() - 1 - i, pos1);
                matrix.get(matrix.size() - 1 - i).set(matrix.size() - 1 - j, pos2);
                matrix.get(matrix.size() - 1 - j).set(i, pos3);
            }
        }
    }

    static String intToString(int number) {
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
        }
        StringBuilder stringBuilder = new StringBuilder();

        while (number != 0) {
            stringBuilder.append(Math.abs(number % 10));
            number = number / 10;
        }
        if (isNegative) {
            stringBuilder.append("-");
        }
        return stringBuilder.reverse().toString();
    }

    static long stringToInt(String number) {
        long total = 0;
        for (int i = 0; i < number.length(); i++) {
            int pos = number.length() - 1 - i;
            int digit = number.charAt(pos) - '0';
            total = total + digit * Math.round(Math.pow(10, i));
        }
        return total;
    }

    static long spreadsheetToInt(String column) {
        long total = 0;
        for (int i = 0; i < column.length(); i++) {
            int pos = column.length() - 1 - i;
            int alphabet = column.charAt(pos) - 'A' + 1;
            total = total + alphabet * Math.round(Math.pow(26, i));
        }
        return total;
    }

    static boolean checkPalindrome(String sentence) {
        for (int i = 0, j = sentence.length() - 1; i < j; i++, j--) {
            while (!Character.isLetterOrDigit(sentence.charAt(i))) {
                i++;
            }

            while (!Character.isLetterOrDigit(sentence.charAt(j))) {
                j--;
            }
            char c1 = Character.toLowerCase(sentence.charAt(i));
            char c2 = Character.toLowerCase(sentence.charAt(j));
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }


    static void reverseAllWordsInSentence(char[] sentence) {
        for (int i = 0, j = sentence.length - 1; i < sentence.length / 2; i++, j--) {
            char left = sentence[i];
            sentence[i] = sentence[j];
            sentence[j] = left;
        }

        int j = 0;
        for (int k = 1; k < sentence.length; k++) {
            if (sentence[k] == ' ') {
                for (int l = j, m = k - 1; l < k / 2; l++, m--) {
                    char temp = sentence[l];
                    sentence[l] = sentence[m];
                    sentence[m] = temp;
                }
                j = k + 1;
            }
        }
        for (int i = j, k = sentence.length - 1; i < k; i++, k--) {
            char temp = sentence[i];
            sentence[i] = sentence[k];
            sentence[k] = temp;
        }

        System.out.println();

    }

    static String LookAndSay(int times) {
        String output = "1";
        for (int i = 0; i < times; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < output.length(); j++) {
                int count = 1;
                while (j + 1 < output.length() && output.charAt(j) == output.charAt(j + 1)) {
                    j++;
                    count++;
                }
                sb.append(count);
                sb.append(output.charAt(j));
            }
            output = sb.toString();
        }
        return output;
    }

    static int firstOccurrenceOfSubString(String t, String s) {
        int iteration = 0;
        for (int i = 0; i < t.length(); ++i) {
            int pos = i;
            for (int j = 0; j < s.length() && pos < t.length(); j++) {
                iteration++;
                char t1 = t.charAt(pos);
                char s1 = s.charAt(j);
                if (t1 != s1) {
                    break;
                }
                if (j == s.length() - 1 && t1 == s1) {
                    return i;
                }
                pos++;
            }
        }
        return iteration;
        //return i;
    }
}
