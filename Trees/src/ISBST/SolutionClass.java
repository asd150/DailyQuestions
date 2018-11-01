package ISBST;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionClass {
    Node root;

    public boolean solution(Node root){
        Queue<Node> queue = new LinkedList<>();
        if(root!=null){
            ((LinkedList<Node>) queue).add(root);
        }

        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp.left!=null){
                if(temp.left.data< temp.data){
                    ((LinkedList<Node>) queue).add(temp.left);
                }
                else {
                    return false;
                }
            }
            if(temp.right!=null){
                if(temp.right.data>temp.data){
                    ((LinkedList<Node>) queue).add(temp.right);
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
