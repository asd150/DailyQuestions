package UniqueCharacter;

import java.util.HashMap;
import java.util.Map;

/**Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.
 */
public class UniqueCharClass {

    public int UniqueChar(String str){

        //leetcode

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
               int c = map.get(str.charAt(i));
               c++;
               map.put(str.charAt(i),c);
            }
            else {
                map.put(str.charAt(i),1);
            }


        }

        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i)) == 1){
               return i;

            }


        }
      return -1;
    }
}
