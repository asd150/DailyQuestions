package DistanceBTnodes;

import java.util.ArrayList;
import java.util.List;

public class SolutionClass {
    Node root;
    List<Node> path1 = new ArrayList<>();
    List<Node> path2 = new ArrayList<>();


    public int distance(Node root,int n1,int n2){
        LCA(root,n1,path1);
        LCA(root,n2,path2);
        //System.out.println(path1.size() + " size ") ;
       // System.out.println(path2.size() + " size ") ;
        Node LCA = null;
        int i=0,j=0;
        int path1Index =0;
        while(i<path1.size() && j<path2.size()){

            if(path1.get(i).data == path2.get(j).data){

                LCA = path1.get(i);
                //System.out.println(path1.get(i).data);
                path1Index = i;

            }
            i++;j++;
        }

        //System.out.println(LCA.data);

            int path1distance = 0;
            for(int x=path1Index;x<path1.size();x++){

                if(path1.get(x).data == n1){

                    break;
                }
                path1distance++;
            }
            int path2Distance =0;
        for(int x=path1Index;x<path1.size();x++){

            if(path2.get(x).data == n2){

                break;
            }
            path2Distance++;
        }
        System.out.println(path1distance);
        System.out.println(path2Distance);
    //System.out.println(path1Index + path2Distance);

        return path1distance + path2Distance;
        }

    public boolean LCA(Node root, int num, List<Node> path){

        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==num){
            return true;
        }
        if(root.left!=null &&  LCA(root.left,num,path)){
           return true;

        }
        if(root.right!=null &&  LCA(root.right,num,path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }

}
