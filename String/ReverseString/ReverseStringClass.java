package String.ReverseString;

public class ReverseStringClass {

    public String reverseOrder(String input) {

        char[] c = input.toCharArray();
        char[] output = new char[c.length];
        for(int i=0;i<c.length;i++){
            output[i] = c[(c.length-1) -i];
        }



    return String.valueOf(output);
    }
}
