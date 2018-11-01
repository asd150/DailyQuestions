package EvenOddArrat;

import java.util.Arrays;

public class EvenOddMain {
    public static void main(String[] args){
        EvenOddClass evenOddClass = new EvenOddClass();
        int[] array = {3,1,2,4};
        System.out.println(Arrays.toString(evenOddClass.sort(array)));
    }
}
