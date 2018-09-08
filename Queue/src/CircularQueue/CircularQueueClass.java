package CircularQueue;
public class CircularQueueClass{

    private int[] array;
    private int head;
    private int tail;

    public  CircularQueueClass(int size){
        array = new int[size];
        this.head =0;
        this.tail =0;

    }

    public void enqueue(int ele){
       if(head==0 && tail == array.length){
           System.out.println("Queue is full");
       }
       else{
           tail = head -1;
           array[tail] = ele;
       }




    }

    public void dequeue(){
        head++;

    }

}