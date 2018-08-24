package ThirdMaxNumber;

import java.util.Arrays;

public class ThirdMaxNumberClass {

    public int solution(int[] array){
        int first =0;
        int sec =0;
        int third =0;
    if(array.length>3) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > sec && array[i] > third) {
                first = array[i];
            } else if (array[i] > third) {
                sec = array[i];
            } else {
                third = array[i];
            }

        }
    }
    else {
        Arrays.sort(array);
        return array[array.length-1];
    }
//        System.out.println(first);
//        System.out.println(sec);
//        System.out.println(third);
        return 0;
    }
}
