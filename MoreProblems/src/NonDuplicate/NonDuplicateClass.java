package NonDuplicate;

import java.util.Arrays;

/**Given an array of integers where every integer occurs three times except for one integer, which only occurs once,
 * find and return the non-duplicated integer.

 For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.*/

public class NonDuplicateClass {

    public void find(int[] array){

        Arrays.sort(array);
        //[1,1,1,3,2,2,2]
        int i=0;
        while(i<=array.length){

            if(i!=array.length-1) {
                if (array[i] == array[i + 2]) {
                    i = i + 3;
                } else {
                    System.out.print(array[i]);
                    break;
                }
            }
            else {
                System.out.print(array[array.length-1]);
                break;
            }

        }

    }
}
