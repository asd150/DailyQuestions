package SortZeros;

import java.util.Arrays;

/**
 * Input:
 * The first line contains an integer 'T' denoting the total number of test cases. In each test cases, First line is number of elements in array 'N' and second its values.
 *
 * Output:
 * Print the sorted array of 0's, 1's and 2's.
 *
 * Constraints:
 *
 * 1 <= T <= 100
 * 1 <= N <= 105
 * 0 <= arr[i] <= 2
 *
 * Example:
 *
 * Input :
 *
 * 2
 * 5
 * 0 2 1 2 0
 * 3
 * 0 1 0
 *
 *
 * Output:
 *
 * 0 0 1 2 2
 * 0 0 1*/
public class SortZerosClass {

    public int[] SortZeros(int[] array){

        int first =0;
        int end = array.length-1;
        int mid = 0;

       while(mid<=end){


            if(array[mid] ==0){
                if(array[first] > array[mid]) {
                    int temp = array[mid];
                    array[mid] = array[first];
                    array[first] = temp;
                    first++;
                    mid++;
                }
            }
            else if(array[mid] == 1){
                    mid++;
            }
            else {
                if(array[mid] > array[end]) {
                    int temp = array[mid];
                    array[mid] = array[end];
                    array[end] = temp;
                    end--;
                }

            }
            System.out.println(Arrays.toString(array));;
        }

        return array;
    }


}
