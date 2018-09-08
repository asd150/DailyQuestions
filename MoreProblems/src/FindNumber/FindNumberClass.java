package FindNumber;

import java.util.ArrayList;
import java.util.List;

public class FindNumberClass {

    public String answer(List<Integer> arr,int k){
        String answer = "No";

       return answer;
    }

    static List<Integer> oddNumbers(int l, int r) {
    List<Integer> answer = new ArrayList<>();

    for(int i =l;i<=r;i++){
        if(i%2 !=0){
            answer.add(i);
        }

    }
    return answer;
    }

}
