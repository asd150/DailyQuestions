package HourGlassSum;

public class HourGlassSumMain {
    public static void main(String[] args){

        HourGlassSumClass sumClass = new HourGlassSumClass();
        int[][] array = new int[][]{
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,1000,2,0,0},
                {0,0,1,2,4,0},
        };
       // System.out.println(array[3][2]);
        sumClass.Solution(array);
    }
}
