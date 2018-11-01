package RepeatedString;

public class InfiniteClass {

    public long solution(String str,long n){
        long length = str.length();
        long remain = n/length;
        long toComplete = length * remain;
        long totalAs =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                totalAs++;
            }
        }
            totalAs = remain*totalAs;
        if(toComplete == n){
            return totalAs;
        }
        else{
           long remainingSpots = n-toComplete;
           for(int i=0;i<remainingSpots;i++){
               if(str.charAt(i)=='a'){
                   totalAs++;
               }
           }
        }


        return totalAs;
    }
}
