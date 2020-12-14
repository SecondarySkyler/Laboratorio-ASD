package BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        Node first = new Node(5);
        BST_Rappresentation tree = new BST_Rappresentation(first);
        Node searched = tree.search(tree.root, 5);
        System.out.print(searched.getKey());
    }
}
