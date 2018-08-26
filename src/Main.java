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
        Trees.BinaryTreeNode binaryTree = generateBinaryTree();
        System.out.println("In-Order");
        Trees.inOrderTraversal(binaryTree);

        //15. Pre-Order Tree traversal
        System.out.println("\nPre-Order");
        Trees.preOrderTraversal(binaryTree);

        //16. Post-Order Tree traversal
        System.out.println("\nPost-Order");
        Trees.postOrderTraversal(binaryTree);

        //17. In-Order No-recursion
        System.out.println("\nIn-Order Iterative");
        Trees.inOrderTraversalNoRecursion(binaryTree);

        //18. In-Order No-recursion
        System.out.println("\nPre-Order Iterative");
        Trees.preOrderTraversalNoRecursion(binaryTree);

        //19. Post-Order No-recursion
        System.out.println("\nPre-Order Iterative II");
        Trees.preOrderTraversalNoRecursion2(binaryTree);

    }

    private static Trees.BinaryTreeNode generateBinaryTree() {
        Trees.BinaryTreeNode root = new Trees.BinaryTreeNode(10);

        Trees.BinaryTreeNode node1 = new Trees.BinaryTreeNode(1);
        Trees.BinaryTreeNode node2 = new Trees.BinaryTreeNode(7);
        Trees.BinaryTreeNode node3 = new Trees.BinaryTreeNode(5);
        Trees.BinaryTreeNode node4 = new Trees.BinaryTreeNode(6);
        Trees.BinaryTreeNode node5 = new Trees.BinaryTreeNode(2);
        Trees.BinaryTreeNode node6 = new Trees.BinaryTreeNode(4);
        Trees.BinaryTreeNode node7 = new Trees.BinaryTreeNode(3);

        root.leftChild = node1;
        root.rightChild = node2;
        node1.leftChild = node3;
        node1.rightChild = node4;
        node4.leftChild = node5;
        node2.leftChild = node6;
        node2.rightChild = node7;

        return root;
    }


}
