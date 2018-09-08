package StringCompression;

import java.util.Arrays;

/**
 * Input:
 * ["a","a","b","b","c","c","c"]
 *
 * Output:
 * Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 *
 * Explanation:
 * "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".*/


public class Class {

    void StringCompression(String... array){

        String currentCharacter = null;
        
        if(array.length>0) {
            currentCharacter = array[0];
            int counter =1;
            int index =0;

            for (int i = 0; i < array.length; i++) {

                    if(array[i].equals(currentCharacter)){
                        counter ++;
                        }
                        else{
                            array[index] = currentCharacter;
                            index++;
                            array[index] = counter + " ";
                            index++;
                            System.out.println(currentCharacter + " \n" + counter );
                            currentCharacter = array[i];
                            counter =1;
                    }
                System.out.println(Arrays.toString(array) + " \n"   );
            }
        }
    }
}
