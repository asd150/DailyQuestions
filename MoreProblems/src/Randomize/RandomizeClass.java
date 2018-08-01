package Randomize;

import java.util.Arrays;
import java.util.Random;
//Fisher-Yates shuffle.

/**
 * Given a function that generates perfectly random numbers between 1 and k (inclusive),
 * where k is an input, write a function that shuffles a deck of cards represented as an array using only swaps.
 *
 * It should run in O(N) time.*/



public class RandomizeClass {

    public int[] randomize(int[] array){
        int[] ans = new int[array.length];

        Random r = new Random();

        for(int i=1;i<array.length;i++) {
            int x = r.nextInt(i);
            System.out.print(x + " ");

            int temp = array[x];
            array[x] = array[i];
            array[i] = temp;

        }
        System.out.print(Arrays.toString(array));
        return ans;

    }
}
