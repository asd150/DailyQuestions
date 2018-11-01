package DistanceBTnodes;

public class SolutionMain {
    public static void main(String [] args){
       SolutionClass tree = new SolutionClass();

        tree.root = new Node(1);
       tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);

    System.out.println(tree.distance(tree.root,8,5));
    }
}
