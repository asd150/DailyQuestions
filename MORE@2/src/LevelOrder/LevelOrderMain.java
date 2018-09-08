package LevelOrder;

public class LevelOrderMain {
    public static void main(String[] args){
        LevelOrderClass tree_level = new LevelOrderClass();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        tree_level.LevelOrder();



    }
}
