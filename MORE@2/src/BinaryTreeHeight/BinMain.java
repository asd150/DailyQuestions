package BinaryTreeHeight;

public class BinMain {
    public static void main(String[] args){

        BinClass tree = new BinClass();
 tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(1);
        tree.root.right = new Node(7);
        tree.root.left.right = new Node(3);

        //tree.maxDepth();
       // tree.topView();
        //tree.RightView(tree.root,0,1);

        tree.preorder(tree.root );
        System.out.println();
        tree.insertion(6,tree.root);
        tree.preorder(tree.root);


    }
}
