import java.util.Stack;

/**
 * Created by Aditya on 8/26/2018.
 */
public class Trees {

    public static class BinaryTreeNode {
        public int data;
        public BinaryTreeNode leftChild;
        public BinaryTreeNode rightChild;

        public BinaryTreeNode(int data) {
            this.data = data;
        }

    }

    static void inOrderTraversal(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.leftChild);
        System.out.print(node.data + " ");
        inOrderTraversal(node.rightChild);
    }

    static void preOrderTraversal(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }

    static void postOrderTraversal(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.leftChild);
        postOrderTraversal(node.rightChild);
        System.out.print(node.data + " ");

    }

    static void inOrderTraversalNoRecursion(BinaryTreeNode curr) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        while (!stack.empty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.leftChild;
            } else {
                curr = stack.pop();
                System.out.print(curr.data + " ");
                curr = curr.rightChild;
            }
        }
    }

    static void preOrderTraversalNoRecursion(BinaryTreeNode currentNode) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        while (!stack.empty() || currentNode != null) {
            if (currentNode != null) {
                System.out.print(currentNode.data + " ");
                stack.push(currentNode);
                currentNode = currentNode.leftChild;
            } else {
                currentNode = stack.pop();
                currentNode = currentNode.rightChild;
            }
        }
    }

    static void preOrderTraversalNoRecursion2(BinaryTreeNode currentNode) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(currentNode);
        while (!stack.isEmpty()) {
            currentNode = stack.pop();
            if (currentNode != null) {
                System.out.print(currentNode.data + " ");
                stack.push(currentNode.rightChild);
                stack.push(currentNode.leftChild);
            }
        }
    }


}
