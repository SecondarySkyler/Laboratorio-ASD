package BinarySearchTree;

public class Node {

    private int key;
    private Node parent;
    private Node left;
    private Node right;

    /** Constructor */
    public Node(int k) {
        this.key = k;
    }

    public int getKey() {
        return key;
    }

    public Node getRight() {
        return this.right;
    }

    public Node getLeft() {
        return this.left;
    }

    public boolean hasParent() {
        return (this.parent != null);
    }

    public boolean hasLeft() {
        return (this.left != null);
    }

    public boolean hasRight() {
        return (this.right != null);
    }

}
