package BuildTree;

public class BuildTreeMain {
    public static void main(String[] args){

        int in[] = new int[]{9, 8, 4, 2, 10, 5, 10, 1, 6, 3, 13, 12, 7};
        int pre[] = new int[]{1, 2, 4, 8, 9, 5, 10, 10, 3, 6, 7, 12, 13};
        //System.out.print(in.length-1);
        BuildTreeClass buildTreeClass = new BuildTreeClass();
        buildTreeClass.buildTree(pre,in,0,in.length-1);

    }
}
