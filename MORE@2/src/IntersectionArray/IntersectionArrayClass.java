package IntersectionArray;

import java.util.ArrayList;
import java.util.List;

public class IntersectionArrayClass {

    public int[] intersection(int[] array1, int[] array2){
        List<Integer> list = new ArrayList<>();
        List<Integer> ansList = new ArrayList<>();

        if(array1.length<array2.length){
            for(int i=0;i<array1.length;i++) {
                list.add(array1[i]);
            }
            for(int i=0;i<array2.length;i++){
                if(list.contains(array2[i])){
                    ansList.add(array2[i]);
                }
            }
        }
        else
        {
            for(int i=0;i<array2.length;i++){
                list.add(array2[i]);
            }
            for(int i=0;i<array1.length;i++){
                if(list.contains(array1[i])){
                    ansList.add(array1[i]);
                }
            }
        }
        int[] arr = new int[ansList.size()];
        for(int i=0;i<ansList.size();i++){
            arr[i] = ansList.get(i);
        }
        return arr;


    }

}
