package SimpleLinkedList;

public class LLmain {
    public static void main(String[] args){

       LlClass llClass = new LlClass(10);
       llClass.addatend(11);
       llClass.addatend(12);
       llClass.addatend(13);
       llClass.addAtHead(9);
       llClass.addAtIndex(3,14);
        System.out.print(llClass.get(1));
       llClass.deleteAtIndex(5);
       System.out.print(llClass.get(1));

    // 9 10 11 12 13 14
    }
}
