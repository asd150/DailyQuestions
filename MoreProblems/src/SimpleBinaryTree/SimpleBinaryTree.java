package SimpleBinaryTree;

public class SimpleBinaryTree {

    Node root;

    public SimpleBinaryTree(){
        root = null;
    }

    public void printPostOrder(Node node){
        if(node==null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);

        System.out.print(node.key);
    }

    public void printinorder(Node  node){
        if(node==null){
            return;
        }
        printinorder(node.left);
        System.out.print(node.key + " ");
        printinorder(node.right);
    }

    public void printPreOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);

    }

    public void printer(){

        printinorder(root);


    }


}
