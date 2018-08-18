import java.util.*;

public class Main {

    public static void main(String[] args) {

        //1. Increment array of integer by 1.
        /*List<Integer> list1 = Problems.incrementArrayOfInts(new ArrayList<>(Arrays.asList(1, 2, 5)));
        List<Integer> list2 = Problems.incrementArrayOfInts(new ArrayList<>(Arrays.asList(1, 2, 9)));
        List<Integer> list3 = Problems.incrementArrayOfInts(new ArrayList<>(Arrays.asList(1, 9, 9)));
        List<Integer> list4 = Problems.incrementArrayOfInts(new ArrayList<>(Arrays.asList(9, 9, 9)));*/

        //2. Delete duplicates from sorted array
        //List<Integer> noDupes = Problems.deleteDuplicates(new ArrayList<>(Arrays.asList(2, 3, 5, 5, 7, 11, 11, 11, 13)));

        //3. Max stock profit
        //int maxProfit = Problems.maxStockProfit(Arrays.asList(310, 315, 275, 295, 260, 270, 290, 230, 255, 250));
        //System.out.println(maxProfit);

        //4. All Primes
        /*List<Integer> allPrimes = Problems.allPrimesBrute(100);
        List<Integer> allPrimes1 = Problems.allPrimesSieve(100);
        System.out.println();*/

        //5. Spiral Order
        /*List<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> row2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        List<Integer> row3 = new ArrayList<>(Arrays.asList(9, 10, 11, 12));
        List<Integer> row4 = new ArrayList<>(Arrays.asList(13, 14, 15, 16));
        List<List<Integer>> matrix3x3 = new ArrayList<>(Arrays.asList(row1, row2, row3, row4));
        List<Integer> spiralOrder = Problems.spiralOrder(matrix3x3);
        System.out.println();*/

        //6.2D array rotation by 90 degree
        List<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> row2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        List<Integer> row3 = new ArrayList<>(Arrays.asList(9, 10, 11, 12));
        List<Integer> row4 = new ArrayList<>(Arrays.asList(13, 14, 15, 16));
        List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(row1, row2, row3, row4));
        Problems.rotation2d(matrix);
        System.out.println();



    }


}
