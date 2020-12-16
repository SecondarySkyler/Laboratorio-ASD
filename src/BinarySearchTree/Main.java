package BinarySearchTree;

public class Main {

    public static void main(String[] args) {

        BST_Rappresentation tree = new BST_Rappresentation(15);
        tree.addNode(17);
        tree.addNode(10);
        tree.addNode(12);
        /**
         *          15
         *         /  \
         *        10   17
         *       /  \
         *           12
         */
        try {
            Node searched = tree.search(tree.root, 12);
            System.out.println(searched.getKey());
        } catch (NullPointerException npe) {
            System.out.print("Nodo non trovato");
        }

        System.out.print(tree.maxKey());


    }
}
