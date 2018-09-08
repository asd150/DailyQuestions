package ThridHighest;
/**
 * TreeSet<Integer> s = new TreeSet<Integer>();
 *         for (int i = 0; i < nums.length; i++) {
 *         	s.add(nums[i]);
 *         	if (s.size() > 3) {
 *         		s.pollFirst();
 *                        }
 *         }
 *         if (s.size() < 3) return s.last();
 *         else return s.first();*/
public class ThirdHighestClass {

    public int ThirdMax(int[] array) {

        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
       // Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i   < array.length; i++) {
           //if(!map.containsKey(array[i])) {

              //  map.put(array[i],i);

                if (array[i] > first) {
                    third = sec;
                    sec = first;
                    first = array[i];
                } else if (array[i] < first && array[i] > sec) {
                    third = sec;
                    sec = array[i];
                } else if(array[i]>third){
                    third = array[i];
                }
           // }
            System.out.println(first + " ");
            System.out.println(sec + " ");
            System.out.println(third + " ");
            System.out.println();
        }

         if(third == Integer.MIN_VALUE || sec == Integer.MIN_VALUE){
            return first;
        }
//        if(map.size()<3){
//            return first;
//        }

        return third;
    }
}
