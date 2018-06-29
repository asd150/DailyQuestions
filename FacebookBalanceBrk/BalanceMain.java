package FacebookBalanceBrk;

public class BalanceMain {
    public static void main(String[] args){

        BalanceClass balanceClass = new BalanceClass();
      boolean s =   balanceClass.balanced("[()]");
            System.out.println(s);
    }
}
