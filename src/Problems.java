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
        for(int i = 0; i < Math.ceil(matrix.size() * 0.5); i++) {
            for(int j = i; j < matrix.size() - 1 - i; j++) {
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
}
