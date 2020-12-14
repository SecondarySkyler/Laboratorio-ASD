package BinarySearchTree;

public class BST_Rappresentation {

    public Node root;


    public BST_Rappresentation(Node n) {
        this.root = n;
    }

    public Node addNode(Node root, int key) {
        while (root != null) {
            if (root.getKey() < key) {
                addNode(root.getRight(), key);
            } else {
                addNode(root.getLeft(), key);
            }
        }
        root = new Node(key);
        return root;
    }

    public Node search (Node root, int key) {
        if(root == null || root.getKey() == key)
            return root;
        if (root.getKey() < key) {
            return search(root.getRight(), key);
        } else {
            return search(root.getLeft(), key);
        }
    }
}
