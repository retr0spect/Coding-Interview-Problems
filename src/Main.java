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

        //4. All Primes
        /*List<Integer> allPrimes = Problems.allPrimesBrute(100);
        List<Integer> allPrimes1 = Problems.allPrimesSieve(100);*/

        //5. Spiral Order
        /*List<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> row2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        List<Integer> row3 = new ArrayList<>(Arrays.asList(9, 10, 11, 12));
        List<Integer> row4 = new ArrayList<>(Arrays.asList(13, 14, 15, 16));
        List<List<Integer>> matrix3x3 = new ArrayList<>(Arrays.asList(row1, row2, row3, row4));
        List<Integer> spiralOrder = Problems.spiralOrder(matrix3x3);*/

        //6. 2D array rotation by 90 degree
        /*List<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> row2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        List<Integer> row3 = new ArrayList<>(Arrays.asList(9, 10, 11, 12));
        List<Integer> row4 = new ArrayList<>(Arrays.asList(13, 14, 15, 16));
        List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(row1, row2, row3, row4));
        Problems.rotation2d(matrix);*/

        //7. Int to String
        //String output = Problems.intToString(-123);

        //8. String to Int
        /*long output = Problems.stringToInt("123");*/

        //9. Spreadsheet to int
        //long output = Problems.spreadsheetToInt("ZZ");

        //10. Palindrome
        //boolean isPalindrome = Problems.checkPalindrome("Ray, isi, yar!");

        //11. Reverse all words in a sentence
        //Problems.reverseAllWordsInSentence(new char[]{'w', 'o', 'o', ' ', 'h', 'o', 'o'});

        //12. Look and Say
        //String result = Problems.LookAndSay(5);

        //13. First occurrence of substring
        //int index = Problems.firstOccurrenceOfSubString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", "aaaaaaaaaaaaaaaaaaaaaaaab");

        //14. Inorder Tree traversal
        //Trees.BinaryTreeNode binaryTree = generateBinaryTree();
        //System.out.println("In-Order");
        //Trees.inOrderTraversal(binaryTree);

        //15. Pre-Order Tree traversal
        //System.out.println("\nPre-Order");
        //Trees.preOrderTraversal(binaryTree);

        //16. Post-Order Tree traversal
        //System.out.println("\nPost-Order");
        //Trees.postOrderTraversal(binaryTree);

        //17. In-Order No-recursion
        //System.out.println("\nIn-Order Iterative");
        //Trees.inOrderTraversalNoRecursion(binaryTree);

        //18. In-Order No-recursion
        //System.out.println("\nPre-Order Iterative");
        //Trees.preOrderTraversalNoRecursion(binaryTree);

        //19. Post-Order No-recursion
        //System.out.println("\nPre-Order Iterative II");
        //Trees.preOrderTraversalNoRecursion2(binaryTree);

        //20. Binary Search
        //boolean found = Searching.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, -1);
        //boolean found1 = Searching.binarySearch(new int[] {1}, 1);

        //21. Binary Search: First Occurrence of K
        //int firstOccurrenceOfK = Searching.firstOccurrenceOfK(new int[] {1, 2, 2, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 2);

        //22. Binary Search: K equals index
        //int result = Searching.kEqualsIndex(new int[]{0, 1, 2, 4, 5, 6, 7, 13, 15, 17, 21});

        //23. Binary Search: Cyclic Sorted Array
        int result = Searching.cyclicSortedArray(new int[]{5, 6, 7, 8, 0, 1, 2, 4});

    }


}
