package JumpingClouds;

    public class JumpingClass {

        public int minSteps(int[] array){

       int steps =0 ;
       int x =0;
       while(x<array.length){

           if(array[x]==0 && x<array.length-2 && array[x+2]==0){
               x=x+2;
               steps++;
           }
           else if(array[x]==0 & x<array.length-1 && array[x+1]==0){
               x++;
               steps++;
           }
           else{
               x++;
           }
       }

        System.out.println(steps);
       return steps;
        }
}
