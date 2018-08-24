package FindLeaders;

public class FindLeadersClass {

    public void leaders(int[] array){

        int leaders =0;
        for(int i=array.length-1;i>0;i--){

            if(array[i]>=leaders){
                leaders = array[i];
                System.out.print(leaders + " ");
            }
        }

    }
}
