package NextRightElement;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;
/**
 * Given the following perfect binary tree,
 *
 *      1
 *    /  \
 *   2    3
 *  / \  / \
 * 4  5  6  7
 * After calling your function, the tree should look like:
 *
 *      1 -> NULL
 *    /  \
 *   2 -> 3 -> NULL
 *  / \  / \
 * 4->5->6->7 -> NULL*/

    public void nextElement(Node root){
        if(root ==null){
            root.next = null;
        }
        Queue<Node> queue = new LinkedList<>();

        ((LinkedList<Node>) queue).add(root);

        int totalNodes = 0;

        while(true){
            int total = queue.size();
            if(total==0){
                break;
            }
            totalNodes++;
            while(total>0){
               Node temp1 = queue.poll();

                if(total==1){
                    System.out.println(temp1.data);
                    temp1.next =null;
                }
                else {
                    temp1.next = queue.peek();
                }
               if(temp1.left!=null){
                   queue.add(temp1.left);
               }
               if(temp1.right!=null){
                   queue.add(temp1.right);
               }

                total--;
            }
        }
        System.out.println(root.right.next);

    }
}

