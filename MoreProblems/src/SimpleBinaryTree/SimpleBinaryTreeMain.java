package SimpleBinaryTree;

public class SimpleBinaryTreeMain {
    public static void main(String[] args){

        SimpleBinaryTree tree = new SimpleBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.printer();
    }
}
