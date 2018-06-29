package InstersectionArrays;

import java.util.Arrays;

public class IntersectionMain {
    public static void main(String[] args){
        IntersectionClass intersectionClass = new IntersectionClass();
        int[] array1 = {1,2,2,1};
        int[] aray2 = {2,2};
      System.out.println(Arrays.toString( intersectionClass.intersection(array1,aray2)));
    }
}
