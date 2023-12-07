class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTreeExample {
    Node root;

    // Constructor
    public BinaryTreeExample() {
        root = null;
    }

    // Method to insert a new node into the binary tree
    private Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Method to insert a new node with given data
    public void insert(int data) {
        root = insert(root, data);
    }

    // Method to perform in-order traversal of the binary tree
    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    // Method to perform pre-order traversal of the binary tree
    private void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    // Method to perform post-order traversal of the binary tree
    private void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Public methods to initiate traversals
    public void inOrderTraversal() {
        System.out.print("In-Order Traversal: ");
        inOrderTraversal(root);
        System.out.println();
    }

    public void preOrderTraversal() {
        System.out.print("Pre-Order Traversal: ");
        preOrderTraversal(root);
        System.out.println();
    }

    public void postOrderTraversal() {
        System.out.print("Post-Order Traversal: ");
        postOrderTraversal(root);
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryTreeExample binaryTree = new BinaryTreeExample();

        // Insert nodes into the binary tree
        binaryTree.insert(50);
        binaryTree.insert(30);
        binaryTree.insert(70);
        binaryTree.insert(20);
        binaryTree.insert(40);
        binaryTree.insert(60);
        binaryTree.insert(80);

        // Perform traversals
        binaryTree.inOrderTraversal();
        binaryTree.preOrderTraversal();
        binaryTree.postOrderTraversal();
    }
}
