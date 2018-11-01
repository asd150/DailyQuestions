package HourGlassSum;

public class HourGlassSumClass {

    public int Solution(int[][] array){

        //diagnol i+1 j+1;
        System.out.println(array[0].length);

        for(int i=0;i<array.length-2;i++){
       int sum =0;
            for(int j=0;j<array[0].length-2;j++){
                System.out.println( i + " " + j);

                sum = array[i][j] + array[i+1][j+1] + array[i+2][j+2] + array[i+2][j] + array[i][j+1]
                + array[i][j+2] + array[i+2][j+1];
                System.out.println(sum);

            }


        }
        return 0;
    }
}
