package MirrorImage;

public class main {
    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
       //System.out.println(tree.isMirror(tree.root));
       //System.out.println(tree.isMirrorUsingStack(tree.root));
        System.out.println(tree.iSrootToLeafSum(tree.root,0,64));
    }
}
