package AddTwoNumbers;

public class addNumMain
{
    public static void main(String[] args){
            LinkedNode l1 = new LinkedNode(5);





            LinkedNode l2 = new LinkedNode(5);


            addNumClass numClass = new addNumClass();

        LinkedNode node =  numClass.solution(l1,l2);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
