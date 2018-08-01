package MaxContSum;
//KANDANE's ALGORITHM
public class MaxSumClass {

    public int maxSum(int[] array){

        int maxEnding = 0;
        int maxSoFar = 0;

        for(int i=0; i<array.length;i++){
            if(array[i] + maxEnding > array[i]){
               maxEnding = array[i] + maxEnding;
            }
            else {
                maxEnding = array[i];
            }

            if(maxSoFar > maxEnding){
                continue;
            }
            else {
                maxSoFar = maxEnding;
            }

        }

        return maxSoFar;
    }
}
