package IntersectionArray;

import java.util.Arrays;

public class IntersectionArrayMain {
    public static void main(String[] args){

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        IntersectionArrayClass arrayClass  = new IntersectionArrayClass();
      System.out.println(Arrays.toString( arrayClass.intersection(nums1,nums2)));

    }
}
