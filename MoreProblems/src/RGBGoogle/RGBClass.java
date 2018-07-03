package RGBGoogle;

import java.util.ArrayList;

/**
 * Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs
 * come first, the Gs come second, and the Bs come last. You can only swap elements of the array.
 *
 * Do this in linear time and in-place.
 *
 * For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'],
 * it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B']..*/


public class RGBClass {

    public String[] RGBSwap(String[] array){

        ArrayList<String> red = new ArrayList<>();
        ArrayList<String> blue = new ArrayList<>();
        ArrayList<String> green = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();
        int redI =0,blueI =0,greenI =0;

        for(int i=0;i<array.length;i++){
                if(array[i].equals("R")){
                    red.add(redI,"R");
                    redI++;
                }
                else if(array[i].equals("B")){
                    blue.add(blueI,"B");
                    blueI++;
                }
                else
                {
                    green.add(greenI,"G");
                    greenI++;
                }
        }

        answer.addAll(red);
        answer.addAll(blue);
        answer.addAll(green);
       answer.toArray(array);




        return array;
    }
}
