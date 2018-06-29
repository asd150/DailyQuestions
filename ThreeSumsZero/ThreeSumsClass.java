package ThreeSumsZero;

import java.util.Arrays;

public class ThreeSumsClass {


    public void threeSumsZero(int[] array){
        Arrays.sort(array);
        for(int i=0;i<array.length-1;i++){
            int left;
            int right;
            left = i+1;
            right = array.length-1;

            while(left < right){
                int sum = array[i]+array[left]+array[right];
                if(sum ==0){
                    System.out.println(array[i] + " " + array[left] + " " + array[right]);
                    left++;right--;
                }
                else if(sum < 0){
                    left++;

                }
                else {
                    right++;
                }
            }

        }

    }
}
