package UberProductProblem;
/*
* Time Complexity = O(n)
* Space Complexity = O(n)*/
public class UberProductClass {

    public int[] findProduct(int[] array){

        //find the priduct of all element first
        int product = array[0];

        for(int i=0;i<array.length-1;i++){
            product = product * array[i+1];
        }

        for(int i=0;i<array.length;i++){
            array[i] = product/array[i];
        }
        System.out.println(product);

        return array;
    }
}
