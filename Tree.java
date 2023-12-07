class Node {
    char data;
    Node left, right;

    public Node(char key) {
        data = key;
        left = right = null;
    }
}

public class Main {
    // root of Tree
    Node root;

    Main() {
        root = null;
    }

    // method to count leaf nodes
    public static int countLeaf(Node node) {
        if (node == null) {
            return 0;
        }
        // if left and right of the node is null
        // it is a leaf node
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeaf(node.left) + countLeaf(node.right);
        }
    }

    public static void main(String[] args) {
        // create an object of Tree
        Main tree = new Main();
        // create nodes of the tree
        tree.root = new Node('p');
        tree.root.left = new Node('g');
        tree.root.right = new Node('w');
        // create child nodes of left child
        tree.root.left.left = new Node('c');
        tree.root.left.right = new Node('k');
        // create child nodes of left child of 'c'
        tree.root.left.left.left = new Node('a');
        tree.root.left.left.right = new Node('e');
        // create child nodes of right child of 'k'
        tree.root.left.right.left = new Node('i');
        tree.root.left.right.right = new Node('m');
        // create child nodes of left child of 'w'
        tree.root.right.left = new Node('s');
        tree.root.right.right = new Node('y');
        // create child nodes of left child of 's'
        tree.root.right.left.left = new Node('q');
        tree.root.right.left.right = new Node('u');
        // create child nodes of right child of 'y'
        tree.root.right.right.left = new Node('x');
        tree.root.right.right.right = new Node('z');

        // call method to count leaf nodes
        int leafNodes = countLeaf(tree.root);
        System.out.println("Total Leaf Nodes = " + leafNodes);
    }
}
