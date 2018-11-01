package LCA;

import java.util.ArrayList;
import java.util.List;

/**Method 1 (By Storing root to n1 and root to n2 paths):
 Following is simple O(n) algorithm to find LCA of n1 and n2.
 1) Find path from root to n1 and store it in a vector or array.
 2) Find path from root to n2 and store it in another vector or array.
 3) Traverse both paths till the values in arrays are same. Return the common element just before the mismatch.*/
public class LCAclass {
    Node root;
    private List<Node> list1 = new ArrayList<>();
    private List<Node> list2 = new ArrayList<>();


    public boolean method1(Node root,int n1, List<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data == n1){

            return true;
        }
        if(root.left!=null && method1(root.left,n1,path) )
            return true ;
        if(root.right!=null && method1(root.right,n1,path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public int helper(Node root,int n1,int n2){
      boolean x =  method1(root,n1,list1);
       boolean y =method1(root,n2,list2);

    int ans =0;
    int i=0,j=0;
    while(i<list1.size() && j<list2.size()){
        if(list1.get(i).data==list2.get(j).data){
            ans = list1.get(i).data;
        }
        i++;
        j++;

    }
        return ans;
    }
}
