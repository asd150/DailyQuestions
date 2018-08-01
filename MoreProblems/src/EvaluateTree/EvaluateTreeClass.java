package EvaluateTree;

public class EvaluateTreeClass {

    Node root;

    public EvaluateTreeClass(){
        root = null;

    }
    int x =0;
    public int evaluate(Node node){

        if(node == null){
            return -10;
        }


        if(node.value == '+'){
            return evaluate(node.left) + evaluate(node.right);
        }
        else if(node.value == '*'){
            return evaluate(node.left) * evaluate(node.right);
        }
        else {
            return -100;
        }






    }

    public void printer(){
       System.out.print( evaluate(root));
    }

}
