package TwoSigma;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestChain {
    public int findLongestChain(String[] words) {
                if (words==null || words.length==0) return 0;
                int longestChain = 0;
                Arrays.sort(words, Comparator.comparingInt(String::length));
                System.out.println(Arrays.toString(words));
                Map<String, Integer> map = new HashMap<String, Integer>();

//
//                for(int i=0;i<words.length;i++){
//                    map.put(words[i],1);
//
//                }
//
//                for(int i=0;i<words.length;i++){
//                    for(int j=0;j<words[i].length();j++){
//
//                    }
//                }

                 for (String word : words) {
                        if (map.containsKey(word)) continue;


                         map.put(word, 1);
                         for (int i=0; i<word.length(); i++) {
                                 StringBuilder sb = new StringBuilder(word);
                                 sb.deleteCharAt(i);
                                 String after = sb.toString();
                                 if (map.containsKey(after) && map.get(after)+1 > map.get(word)) {
                                         map.put(word, map.get(after)+1);
                                     }
                             }
                         if (map.get(word) > longestChain) longestChain = map.get(word);
                     }
                 return longestChain;
             }

             /**
 35      * @param args
 36      */
             public static void main(String[] args) {
                 // TODO Auto-generated method stub
                 LongestChain sol = new LongestChain();
                 //String[] words = new String[]{"6", "a", "b", "ba", "bca", "bda", "bdca"};
                 //String[] words = new String[]{"a", "a", "bc", "exf", "abc"};
                 String[] words = new String[]{"abc", "bc"};
                 int longestChain = sol.findLongestChain(words);
                 System.out.println(longestChain);
             }

         }
