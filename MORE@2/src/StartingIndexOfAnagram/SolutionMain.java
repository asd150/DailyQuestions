package StartingIndexOfAnagram;
/**Given a word W and a string S, find all starting indices in S which are anagrams of W.

 For example, given that W is "ab", and S is "abxaba", return 0, 3, and 4.*/
public class SolutionMain {
    public static void main(String[] args){
        SolutionClass solutionClass = new SolutionClass();
        solutionClass.solution("ab","abxaba");
    }
}
