package SingleLinkedList;

public class SingleLL{

    private Node head;

    public SingleLL(){
        head = null;
    }

    public void addLast(int data){
        Node n = new Node(data,null);
        head.next = n;
    }


    private static class Node{
        private int data;
        private Node next;

        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }

}