package StringCompression;

public class StringCompressionClass {

    public void Compression(String[] array){

        //["a","a"] = ["a",2]
        String first = array[0];
        int counter = 0;

        for(int i=0;i<array.length;i++){
            if(array[i] == first){
                counter++;
            }
            else{

            }
        }
    }
}
