package BinaryTreeHeight;

import java.util.*;

public class BinClass {

    Node root;
    int maxLevel =0;



    public BinClass(int data) {
        root = new Node(data);

    }
    public BinClass(){
        root = null;
    }
    public void preorder(Node root){
        if(root==null){
            return;
        }

        preorder(root.left);
        System.out.println(root.data);
        preorder(root.right);
    }

    public int maxDepth() {
        int height =0;

        //level orfer traversal

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(true){
            System.out.println(height);
            int nodeCount = queue.size();
            if(nodeCount==0){
                return height;
            }
            height++;

            while(nodeCount>0){
                Node temp = queue.poll();
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
                nodeCount--;
            }
        }





    }

    public void RightView(Node root,int maxLevel,int level){
        //The idea is tp print the rightmost node from each level
        if(root==null){
            return;
        }
        if(maxLevel<level){
            System.out.println(root.data);
            this.maxLevel = level;

        }
        //System.out.println(maxLevel +  " 1");
        RightView(root.right,this.maxLevel,level+1);
        RightView(root.left,this.maxLevel,level+1);


    }

    public void topView(){
        if(root==null){
            return;
        }
        int hd =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,root.data);
        resursion(hd,map,root);
        print(map);

    }
    public void resursion(int hd,Map<Integer,Integer> map,Node node){
        System.out.println(map.keySet().toString());
        if(!map.containsKey(hd)){
            map.put(hd,node.data);
        }
        if(node.left!=null){
            resursion(hd-1,map,node.left);
        }
        if(node.right!=null){
            resursion(hd+1,map,node.right);
        }
        System.out.println(map.keySet().toString());
    }

    public void print(Map<Integer,Integer> map){
        for (int i: map.keySet()
             ) {
            System.out.println(map.get(i));
        }
    }

    public void insertion(int data,Node root){
        if(root==null){
            Node newNode = new Node(data);
            this.root = newNode;
        }

        Queue<Node> queue = new LinkedList<>();

        ((LinkedList<Node>) queue).add(this.root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp.left==null){
                temp.left = new Node(data);
                return;
            }
            else if(temp.right==null){
                temp.right = new Node(data);
                return;
            }
            else
            {
                ((LinkedList<Node>) queue).add(temp.left);
                ((LinkedList<Node>) queue).add(temp.right);
            }
        }
    }


}
