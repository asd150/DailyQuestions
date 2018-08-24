package DuplicateNumber;

import java.util.HashMap;
import java.util.Map;

public class Class {
    public int solution(int[] array){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){

               return array[i];
            }
            else {
                map.put(array[i],i);
            }
        }
        return 0;
    }
}
