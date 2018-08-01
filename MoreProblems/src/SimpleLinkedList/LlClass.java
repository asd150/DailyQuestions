package SimpleLinkedList;

public class LlClass {

    LLNode head ;
    private  int size =0;


    public LlClass( int value){
        head = new LLNode(value);
        head.next = null;
        size++;
    }

    public void addatend(int value){
        LLNode node = new LLNode(value);
        LLNode current = head;
        int counter=0;
        //System.out.print(current.value);
        while(current.next!=null){
            //System.out.print(current.value);
            current = current.next;
            counter++;
        }
        //System.out.print("ADD " + counter);
        current.next =   node;
        size++;

    }

    public int get(int index) {

     LLNode curr = head;

     while(curr!=null){
            System.out.print(curr.value + " ");
            curr = curr.next;
     }

     //System.out.print(size + " ");

       return 0;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {

        LLNode node = new LLNode(val);

        node.next = head;
        head = node;
        size++;

    }
//
//    /** Append a node of value val to the last element of the linked list. */
//    public void addAtTail(int val) {
////        LLNode node = new LLNode(val);
////
////
////
////    }
//
//    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        LLNode current = head;
        LLNode toAdd = new LLNode(val);

       // System.out.print(index + " ");
        if(index<size) {
            for (int i = 0; i < index-1; i++) {
                System.out.print(current.value + " " + " " + i + "\n");
                current = current.next;
            }
        }
        else {
            System.out.print("index out of bound ");
            return;
        }
        System.out.print(current.value + " current val ");
        LLNode temp = current.next;
        current.next = toAdd;
        toAdd.next = temp;

    }
//
//    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

        LLNode current = head;

        // System.out.print(index + " ");
        if(index<size) {
            for (int i = 0; i < index-1; i++) {
                System.out.print(current.value + " " + " " + i + "\n");
                current = current.next;
            }
            if(current.next.next!=null){
                current.next = current.next.next;
            }

        }
        else if(index==size){
            for (int i = 0; i < index-1; i++) {
                System.out.print(current.value + " " + " " + i + "\n");
                current = current.next;
            }
            current.next = null;
        }
        else {
           // System.out.print("index out of bound ");
            return;
        }
        System.out.print(current.value + " current val ");





    }

}
