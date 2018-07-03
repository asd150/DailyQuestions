package RGBGoogle;

public class RGBMain {
    public static void main(String[] args){
        RGBClass rgbClass = new RGBClass();
        String[] array1 = {"G", "B", "R", "R", "B", "R", "G"};
     String[] array =  rgbClass.RGBSwap(array1);
     for(int i=0;i<array.length;i++){
         System.out.print(array[i]);
     }

    }
}
