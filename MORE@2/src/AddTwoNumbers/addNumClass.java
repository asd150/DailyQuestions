package AddTwoNumbers;
/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.*/


public class addNumClass {
    public LinkedNode solution(LinkedNode l1,LinkedNode l2){
      LinkedNode result = null;
      LinkedNode head = null;
      int carry=0;
      int ans = 0;
      boolean first = true;
      while (l1!=null || l2!=null){
          int val1 =0;
          if(l1==null){
              val1 =0;
          }
          else val1 = l1.val;

          int val2;
          if(l2==null){
              val2 =0;
          }else {
              val2 = l2.val;
          }
   // System.out.println(" * " + val1 + " " + val2);
          ans = val1 + val2 + carry;
            carry =0;
          int unit =0;
          int tens =0;
          if(ans>9){
              unit = ans%10;
              tens = (ans/10)%10;
              carry = tens;
             if(first){
                 result = new LinkedNode(unit);
                 head =result;
                 first = false;
             }
             else{
                 LinkedNode newl = new LinkedNode(unit);
                 result.next = newl;
                 result = newl;
             }
          }else {
              if(first){
                  result = new LinkedNode(ans);
                  head = result;
                  first = false;
              }
              else{
                  //System.out.println("flag 1");
                  LinkedNode newl = new LinkedNode(ans);
                  //System.out.println(result.val);
                  result.next = newl;
                 // System.out.println(result.next.val + " v ");
                  result = result.next;
                  //System.out.println(result.val + " v ");
              }
          }

         // System.out.println(result.val + " values ");

          if(l1!=null)l1 = l1.next;
          if(l2!=null)l2 = l2.next;
          //ans=0;
      }
    if(carry!=0){
        result.next = new LinkedNode(carry);

    }
      return head;
    }
}
