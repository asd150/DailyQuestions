package StackProblems;

public class BracketMain {
    public static void main(String[] args){

        BracketBalances bracketBalances = new BracketBalances();
       String ans = bracketBalances.findBalances("{({({{}");
        System.out.println(ans);
    }
}
