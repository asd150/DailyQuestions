package SumRootToLeaf;

public class SumMain {
    public static void main(String[] args){
        SumClass tree = new SumClass();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(5);
        tree.root.right.right = new TreeNode(4);
        tree.root.left.left = new TreeNode(2);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.right.right = new TreeNode(4);
        tree.root.left.right.left = new TreeNode(7);
        tree.startRec(tree.root);
    }
}
