package EvenOddArrat;

public class EvenOddClass {
    public int[] sort(int[] array){
        int j = array.length-1;
        int i = 0;
        while(i<=j){
            if(array[i] % 2 != 0 && array[j]%2!=0){
              j--;
            }
            else if(array[i]%2 !=0 && array[j]%2 ==0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }else {
                j--;
            }

        }

        return array;
    }
    public void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
