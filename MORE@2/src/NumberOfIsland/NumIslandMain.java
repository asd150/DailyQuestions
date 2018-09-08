package NumberOfIsland;

public class NumIslandMain {
    public static void main(String[] args){
        int[][] arr = new int[][]{
                {1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,0,0},
                {0,0,0,0,0},
        };


        NumIslandClass islandClass = new NumIslandClass() ;
            islandClass.numberofIsland(arr);
            System.out.println(islandClass.counter);

    }
}
