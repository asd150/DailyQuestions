package SherlocknValidString;

public class SolutionClass {

    public String solution(String str){

        int[] array = new int[26];
        boolean firstChange = false;

        for(int i=0;i<str.length();i++){
            array[str.charAt(i)-'a']++;
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);

            if(array[i]>3){
                return "NO";
            }
        }
        return "YES";
    }
}
