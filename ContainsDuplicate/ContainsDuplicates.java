package ContainsDuplicate;

import java.util.Arrays;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] array){
        int x =0;
        Arrays.sort(array);
        for(int i=0;i<array.length-1;i++){
            if(array[i] == array[i+1]){
                x=1;
            }
        }
        if(x==1){
            return true;
        }
        else {
            return false;
        }
    }
}
