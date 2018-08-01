package EquilibriumPoint;
/**
 * Given an array A your task is to tell at which position the equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements below it is equal to the sum of elements after it.
 *
 * Input:
 * The first line of input contains an integer T denoting the no of test cases then T test cases follow. First line of each test case contains an integer N denoting the size of the array. Then in the next line are N space separated values of the array A.
 *
 * Output:
 * For each test case in a new  line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.
 *
 * Constraints:
 * 1<=T<=100
 * 1<=N<=100
 *
 * Example:
 * Input:
 * 2
 * 1
 * 1
 * 5
 * 1 3 5 2 2
 *
 * Output:
 * 1
 * 3
 *
 * Explanation:
 * 1. Since its the only element hence its the only equilibrium point
 * 2. For second test case equilibrium point is at position 3 as elements below it (1+3) = elements after it (2+2)*/


public class EQpointClass {

    public int EQ(int[] array){

        if(array.length==1) {
            return 0;
        }
        else if(array.length == 2){
            return 0;
        }

        int eqpoint = array.length/2;

        int result = summer(array,eqpoint);

        if(result==0){
            return eqpoint;
        }
        else if(result<0){
            eqpoint++;
        }
        else {
            eqpoint--;
        }

        return eqpoint;
    }


    public int summer(int[] array,int eqpoint){
        int sum =0;


        for(int i=0;i<array.length;i++){

            if(i<eqpoint){
                sum =sum + array[i];
            }
            else if(i == eqpoint){

            }
            else {
                sum = sum-array[i];
            }
        }
        return sum;
    }

}
