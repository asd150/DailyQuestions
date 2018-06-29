package FacebookBalanceBrk;

public class BalanceClass {

    public boolean balanced(String str){

        int round =0;
        int curl =0;
        int square = 0;

        char[] arr = str.toCharArray();

        for(int i = 0; i< arr.length;i++){
            if(arr[i] == '('){
                round++;
            }
            else if(arr[i] == ')'){
                round--;
            }
            else if(arr[i] == '['){
                square++;
            }
            else if(arr[i] == ']'){
                square--;
            }
            else if(arr[i] == '{'){
                curl++;
            }
            else if(arr[i] == '}'){
                curl--;
            }

        }

        if(round==0 && curl ==0 && square ==0){
            return true;
        }
        else
            return false;

    }
}
