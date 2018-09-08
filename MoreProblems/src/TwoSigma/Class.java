//package TwoSigma;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
///**
// *     // Complete the friendCircles function below.
// *     static int friendCircles(List<String> friends) {
// *         //given List -> convert to String[]
// *         //{"YNYY","NYNY"}
// *         String[] ListToArray = friends.toArray(new String[0]);
// *         //create 2d array of chars
// *         char[][] TwoDArray = new char[ListToArray.length][ListToArray.length];
// *
// *         for(int i=0;i<ListToArray.length;i++){
// *             TwoDArray[i] = ListToArray[i].toCharArray();
// *         }
// *
// *         int n = TwoDArray.length;
// *
// *         if(n==1){
// *             return 1;
// *         }
// *         int NumberofCircles =0;
// *         int[] initial = new int[n];
// *         for(int i=0;i<initial.length;i++){
// *             initial[i] = 0;
// *         }
// *
// *         for(int i=0;i<n;i++){
// *             if(initial[i] ==1)
// *             {continue;}
// *             else {
// *                 initial[i] = 1;
// *             }
// *
// *
// *             updateInPlace(TwoDArray,initial,i);
// *             NumberofCircles++;
// *         }
// *
// *     return NumberofCircles;
// *
// *
// *     }
// * private static void updateInPlace(char[][] dArray, int[] bool, int i) {
// *         for (int j = 0; j < dArray.length; j++) {
// *
// *            //if true ..continue
// *             if (bool[j] ==1) continue;
// *
// *            //same person..do nothing
// *             if (i == j) continue;
// *
// *             //if they are friends,mark it true and use recursion in that person
// *             if (dArray[i][j] == 'Y') {
// *                 bool[j] = 1;
// *                 updateInPlace(dArray, bool, j);
// *             }
// *         }
// *     }*/
//
//
//public class Class {
//
//    static int friendCircles(String[] friends) {
//    //friends = array
//        List<Set> list = new ArrayList<>();
//
//        for (int friend = 0; friend < friends.length; friend++) {
//            String contacts = friends[friend];
//            for (int contact = 0; contact < contacts.length(); contact++) {
//
//                Set<Integer> s1 = null, s2 = null;
//                if (contacts.charAt(contact) == 'Y') {
//                    for (Set s : list) {
//                        if (s.contains(friend))
//                            s1 = s;
//                        if (s.contains(contact))
//                            s2 = s;
//                    }
//                    if (s1 == null && s2 == null) {
//                        Set<Integer> newSet = new HashSet<>();
//                        newSet.add(contact);
//                        newSet.add(friend);
//                        list.add(newSet);
//                    } else if (s1 == null && s2 != null) {
//                        s2.add(friend);
//                    } else if (s2 == null && s1 != null) {
//                        s1.add(contact);
//                    } else {//both not null
//                        if(s1 != s2) {
//                            for (Integer s : s2) {
//                                s1.add(s);
//                            }
//                            list.remove(s2);
//                        }
//
//                    }
//                }
//            }
//
//        }
//        System.out.println(list);
//        return list.size();
//    }
//
//    }
//}
