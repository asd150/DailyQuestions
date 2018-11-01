package StringAnagram;

public class SolutionClass {

    public void solution(String str1,String str2){

        int[] array = new int[26];
        int ans=0;
        for(int i=0;i<str1.length();i++){
            array[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            array[str2.charAt(i)-'a']--;
        }
        for (int anArray : array) {
            ans = ans + Math.abs(anArray);
        }
        System.out.println(ans);

    }
}
