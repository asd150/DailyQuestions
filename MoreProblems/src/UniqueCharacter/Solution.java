package UniqueCharacter;

public class Solution {

        public int firstUniqChar(String s) {
            if(s== null  || s.length()==0)
                return -1;
            int index=Integer.MAX_VALUE;
            //System.out.println(index);
            for(char c='a';c<='z';c++){
                int first = s.indexOf(c) ;
                System.out.println(first);
                int last = s.lastIndexOf(c);
                System.out.println(c + " last " +last);
                System.out.println("index "+index);
                if(first!=-1 && first==last && first<index)
                    index=first;
            }
            return index== Integer.MAX_VALUE?-1:index;
        }
    }
