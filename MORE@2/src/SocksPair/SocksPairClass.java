package SocksPair;

import java.util.HashMap;
import java.util.Map;

public class SocksPairClass {

    public void SocksPair(int[] array){
        int pairs =0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }
            else{
               int temp = map.get(array[i]);
                temp++;
                map.put(array[i],temp);
               System.out.println(array[i] + " " + temp);
               if(temp == 2){
                   System.out.println("here" + i );
                   pairs++;
                   map.remove(array[i]);
               }

               System.out.println(array[i] + " " + temp);


            }
        }
        System.out.println(pairs);
    }
}
