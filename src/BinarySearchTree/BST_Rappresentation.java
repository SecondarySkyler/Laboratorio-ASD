package BinarySearchTree;

public class BST_Rappresentation {

    public Node root;


    public BST_Rappresentation(int n) {
       this.root = new Node(n);
    }

    /**
     * method to add a node into a bst
     * @param key of the node to insert
     * @return a bst with node z with z.getKey() = key
     */
    public void addNode(int key) {
        Node y = null;
        Node x = this.root;

        while (x != null) {
            y = x;
            if (x.getKey() > key) {
                x = x.getLeft();
            } else {
                x = x.getRight();
            }
        }
        Node z = new Node(key);
        z.parent = y;
        if (y.getKey() > z.getKey()) {
            y.left = z;
        } else {
            y.right = z;
        }
    }

    /**
     * method to search for a key in a bst
     * @param root of the bst
     * @param key to search for
     * @return the key if is in the bst
     * @throws NullPointerException is key is not in the bst
     */
    public Node search (Node root, int key) {
        if(root == null || root.getKey() == key)
            return root;
        if (root.getKey() < key) {
            return search(root.getRight(), key);
        } else {
            return search(root.getLeft(), key);
        }
    }

    /**
     *
     * @return the max key in the bst
     */
    public int maxKey() {
        return maxKeyRecursive(this.root);
    }

    private int maxKeyRecursive(Node n) {
        while (n.right != null) {
            n = n.getRight();
            maxKeyRecursive(n);
        }
        return n.getKey();
    }
}
