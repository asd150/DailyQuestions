package DetectCycleLL;

public class DetectMain {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.head = new LinkedList.Node(50);
        list.head.next = new LinkedList.Node(20);
        list.head.next.next = new LinkedList.Node(15);
        list.head.next.next.next = new LinkedList.Node(4);
        list.head.next.next.next.next = new LinkedList.Node(10);

        // Creating a loop for testing
        list.head.next.next.next.next.next = list.head.next.next;
        DetectClass detectClass = new DetectClass();
        detectClass.sol(LinkedList.head);
    }
}
