package MergeSortedArrays;

public class MergeSortedMain {
    public static void main(String[] args){
        MergeSortedClass mergeSortedClass = new MergeSortedClass();
        int[] array1 =  {1,2,3,4,0,0,0};
        int[] nums2 = {2,5,6};
        mergeSortedClass.mergeArrays(array1,nums2);
    }
}
