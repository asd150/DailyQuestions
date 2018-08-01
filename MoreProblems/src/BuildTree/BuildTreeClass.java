package BuildTree;

public class BuildTreeClass {
    Node root;
    static int anInt =-1;

    public Node buildTree(int[] pre,int[] inOrder,int start,int end) {
        System.out.print(anInt + "\n");

        if(start>end){
            return null;
        }
        Node tNode = new Node(pre[anInt+1]);
//        System.out.print(tNode.value);
        if(start==end){
            return tNode;
        }
        int index = search(pre,inOrder,start,end,tNode.value);
        //System.out.print(index);
        int iminus = index-1;
        int plus = index+1;

        tNode.left = buildTree(pre,inOrder,start,iminus);
        tNode.right = buildTree(pre,inOrder,plus,end);


        return tNode ;
    }

    public int search(int[] pre,int[] inOrder,int start,int end,int value){
            int index =0;

        for(int i=start;i<=end;i++){
            if(inOrder[i] == value){
                index = i;
            }
        }
return index;
    }
}

