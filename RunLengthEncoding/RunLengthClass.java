package RunLengthEncoding;

public class RunLengthClass {

    public String encode(String str){
        //AAABB
        char[] array = str.toCharArray();

        char current = 0;
        int counter = 1;

        for(int i=0;i<array.length-1;i++){

            current = array[i];

            if(array[i] == array[i+1]){
                counter++;
                System.out.println(" 1 "+counter + " " + current);
            }
            else if(array[i] != array[i+1]){
                current = array[i+1];
                counter = 1;
                System.out.println(" 2 "+counter + " " + current);
            }

        }





        return str;

    }
}
