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
        List<Integer> allPrimes = Problems.allPrimesBrute(100);
        List<Integer> allPrimes1 = Problems.allPrimesSieve(100);
        System.out.println();


    }


}
