package SingleNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumberClass {

    public int singleNumber(int[] array){
    Arrays.sort(array);
    boolean found =false;
    int c= -1;
        int i=0;
        while(i<array.length-1){
            //System.out.println("i = " + i);

            if(array[i] == array[i+1] && i!=array.length-1){
                i = i+2;

               // System.out.println(array[i]);

            }

            else {
                found = true;
               c=array[i];
                i++;

            }


        }
        if(!found){
            System.out.println(array[array.length-1]);
        }
        return c;
    }
}
