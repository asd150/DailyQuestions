package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSumClass {

    public int[] twoSum(int[] array,int target){
        int[] ans = new int[2];
        if(array.length<2 ){
            return ans;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(target-array[i])){
                ans[0] = map.get(target-array[i]);
                ans[1] = i;
                return ans;
            }
            else {
                map.put(array[i],i);
            }
        }
     return ans;
    }
}
