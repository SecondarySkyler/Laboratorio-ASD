package BinarySearchTree;

public class Node {

    private int key;
    public Node parent;
    public Node left;
    public Node right;

    /** Constructor */
    public Node(int k) {
        this.key = k;
    }

    /** return the key for this node */
    public int getKey() {
        return key;
    }

    /** return right child node */
    public Node getRight() {
        return this.right;
    }

    /** return left child node */
    public Node getLeft() {
        return this.left;
    }

    /** return parent node */
    public Node getParent() {
        return this.parent;
    }

}
