package ISBST;

public class SolutionMain {
    public static void main(String[] args){

        SolutionClass tree = new SolutionClass();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
       System.out.print( tree.solution(tree.root));
    }
}
