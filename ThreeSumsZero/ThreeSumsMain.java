package ThreeSumsZero;

//Time Complexity  = O(N2)
//space Complexity = O(1)

public class ThreeSumsMain {
    public static void main(String[] args){

        ThreeSumsClass threeSumsClass = new ThreeSumsClass();

        int[] array = {-2,-1,0,1};
        threeSumsClass.threeSumsZero(array);
    }
}
