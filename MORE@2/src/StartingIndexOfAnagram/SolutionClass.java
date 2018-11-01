package StartingIndexOfAnagram;

public class SolutionClass {
    public void solution(String w,String s){
        //find the starting character.
        //check that the conseq chars are same as w.
        int start =0;
        int end =0;
        for(int i=0;i<s.length();i++){
            if(w.charAt(0) == s.charAt(i)){
            start = i;
                System.out.println(i);
            }
            if(w.charAt(w.length()-1) == s.charAt(i)){
                end = i;
                System.out.println(i);
            }
        }

    }
}
