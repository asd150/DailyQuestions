package MirrorImage;

import java.util.Stack;

public class BinaryTree {
    Node root;
    public boolean isMirror(Node root1){
        // For two trees to be mirror images, the following three
        // conditions must be true
        // 1 - Their root node's key must be same
        // 2 - left subtree of left tree and right subtree
        //      of right tree have to be mirror images
        // 3 - right subtree of left tree and left subtree
        //      of right tree have to be mirror images


       return root1 == null || helper(root1.left,root1.right);
    }
    public boolean helper(Node node1, Node node2){

        if(node1 == null || node2 == null){
            return node1 == node2;
        }
        if(node1.key != node2.key){
            return false;
        }
        return helper(node1.left,node2.right) && helper(node1.right,node2.left);

    }

    public boolean isMirrorUsingStack(Node root){
        if(root == null){
            return true;
        }
        Node left,right;
        Stack<Node> stack = new Stack<>();
        left = root.left;
        right = root.right;

        stack.push(left);
        stack.push(right);
        while(!stack.empty()){
            right = stack.pop();
            left = stack.pop();
            if(left.key!=right.key){
                return false;
            }
            if(left.left!=null){
                if(right.right==null){
                    return false;
                }
                else {
                    stack.push(left.left);
                    stack.push(right.right);
                }
            }
            else if(right.right!=null){
                return false;
            }

            if(left.right!=null){
                if(right.left == null ){
                    return false;
                }
                else {
                    stack.push(left.right);
                    stack.push(right.left);
                }

            }
            else if(right.left!=null){
                return false;
            }
        }
        return true;
    }

    //path sum root to leaf
    /**Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

     Note: A leaf is a node with no children.

     Example:

     Given the below binary tree and sum = 22,

     5
     / \
     4   8
     /   / \
     11  13  4
     /  \      \
     7    2      1
     return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.*/


    public boolean iSrootToLeafSum(Node root, int val,int givenSum){
        if(root == null){

            return false;
        }
        else {
            boolean ans = false;
            val = val + root.key;

            if (root.left == null && root.right == null && val == givenSum ) {
                    //System.out.println(" sum "+val + " " + givenSum);
                    ans = true;

            }



                ans = ans ||    iSrootToLeafSum(root.left, val, givenSum);
                   ans = ans || iSrootToLeafSum(root.right, val, givenSum);
                    //System.out.println(ans + "&  ");


            return ans;
        }

    }
}
