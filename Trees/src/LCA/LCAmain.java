package LCA;

public class LCAmain {
    public static void main(String[] args){
        LCAclass tree= new LCAclass();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
       System.out.print( tree.helper(tree.root,3,4));
    }
}
