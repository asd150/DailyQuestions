package MaxDepth;

public class MaxDepthClass {
    Node root;
    public void maxDepth(Node root,int level ){

        //use bfs
       if (root==null){

           return;
       }
        if(root.left==null && root.right == null){
            System.out.println("* " + level);
        }
        else {
            maxDepth(root.left,level+1);
            maxDepth(root.right,level+1);
        }



    }
}
