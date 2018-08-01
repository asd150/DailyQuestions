package EvaluateTree;

public class EvaluateTreeMain {
    public static void main(String[] args){
        EvaluateTreeClass tree = new EvaluateTreeClass();
        tree.root = new Node('*');
        tree.root.left = new Node('+');
        tree.root.right = new Node('+');
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(2);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);

        tree.printer();
    }
}
