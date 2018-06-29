public class RemoveDuplicates {
    private int counter =0;

    public int removeDuplicates(int[] array){

        int[] arr = new int[array.length];

        for(int i =0; i< array.length;i++){
            if(i < array.length-1){
                if(array[i] != array[i+1]){
                    System.out.println(arr[i] + ""+ i);
                    array[counter++] = array[i];

                }
            }
            else
            {
                array[counter++] = array[array.length-1];
            }
        }

        return counter;
    }
}
