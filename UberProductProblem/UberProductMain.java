package UberProductProblem;

import java.util.Arrays;

public class UberProductMain {
    public static void main(String[] args){

        UberProductClass uber = new UberProductClass();
        int[] array = {1, 2, 3, 4, 5};
       System.out.println(Arrays.toString( uber.findProduct(array)));
    }
}
