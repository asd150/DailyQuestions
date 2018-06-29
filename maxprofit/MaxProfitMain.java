package maxprofit;

public class MaxProfitMain {
    public static void main(String[] args){

        MaxProfit maxProfit = new MaxProfit();
       int[] array = {5,4,3,2,1};
        maxProfit.checkProfit(array);
        System.out.println(maxProfit.currentMax);

    }
}
