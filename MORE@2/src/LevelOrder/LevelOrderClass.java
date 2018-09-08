package LevelOrder;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}
public class LevelOrderClass {

    Node root;

    public void LevelOrder(){

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        System.out.println(queue.toString());

        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.println(tempNode.data + "\n");

            if(tempNode.left!=null){
                queue.add(tempNode.left);

            }

            if(tempNode.right!=null){
                queue.add(tempNode.right);
            }

        }

    }
}
