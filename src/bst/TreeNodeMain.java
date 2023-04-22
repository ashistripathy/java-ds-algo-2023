package bst;

public class TreeNodeMain<T> {
    public static void main(String[] args) {
        // 1st sample
        TreeNode<String> root = new TreeNode<>("A");
        root.setLeftChild(new TreeNode<>("B"));
        root.setRightChild(new TreeNode<>("C"));
        root.getLeftChild().setLeftChild(new TreeNode<>("D"));
        root.getLeftChild().setRightChild(new TreeNode<>("E"));

        // Print the tree in preorder traversal
        System.out.print("Preorder traversal: ");
        preorderTraversal(root);

        System.out.print("\npostorder traversal: ");
        postorderTraversal(root);

        // 2nd sample
        TreeNode<Integer> rootOne = new TreeNode<>(6);
        rootOne.setLeftChild(new TreeNode<>(4));
        rootOne.setRightChild(new TreeNode<>(9));
        rootOne.getLeftChild().setLeftChild(new TreeNode<>(2));
        rootOne.getLeftChild().setRightChild(new TreeNode<>(5));
        rootOne.getRightChild().setLeftChild(new TreeNode<>(7));
        rootOne.getRightChild().setRightChild(new TreeNode<>(10));

        // Print the tree in preorder traversal
        System.out.print("\nPreorder traversal: ");
        preorderTraversal(rootOne);

        System.out.print("\npostorder traversal: ");
        postorderTraversal(rootOne);
    }
    // preorder tree traversal
    public static<T> void preorderTraversal(TreeNode<T> node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorderTraversal(node.getLeftChild());
            preorderTraversal(node.getRightChild());
        }
    }
    // postorder tree Traversal
    private static<T> void postorderTraversal(TreeNode<T> node) {
        if (node != null){
            postorderTraversal(node.getLeftChild());
            postorderTraversal(node.getRightChild());
            System.out.print(node.getData() + " ");
        }
    }
}
