import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] array = {1, 1, 1, 1, 1, 2, 2,3};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int newA = removeDuplicates.removeDuplicates(array);
        for (int i = 0; i < newA; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
