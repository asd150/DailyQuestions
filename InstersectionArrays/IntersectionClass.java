package InstersectionArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionClass {

    public int[] intersection(int[] array1,int[] array2){

        //sort the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i =0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<array1.length && j<array2.length){
            if(array1[i]<array2[j]) {
                i++;
            }
            else if (array1[i]>array2[j]){
                j++;
            }
            else {
                list.add(array1[i]);
                i++;
                j++;

            }
        }

        int[] arr = new int[list.size()];
        for(int k=0;k<list.size();k++){
            arr[k]=list.get(k);
        }

       return arr;
    }
}
