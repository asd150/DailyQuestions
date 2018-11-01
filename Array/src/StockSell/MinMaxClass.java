package StockSell;

public class MinMaxClass {
    public void minMax(int[] array){

        int minPrice =Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]<minPrice){
                minPrice = array[i];

            }
            else {
                if(array[i]-minPrice > maxPrice){
                    maxPrice = array[i] - minPrice;
                }
            }
        }


        System.out.println(maxPrice);

    }
}
