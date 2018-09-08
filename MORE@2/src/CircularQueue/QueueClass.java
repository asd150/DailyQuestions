package CircularQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

    private int[] array;
    private int head;
    private int tail;
    boolean isFull ;



    Queue<Integer> integerQueue;
    private int limit=0;
    private double counter=0;
    private double sum =0;

    public QueueClass(int size)
    {
        array = new int[size];

        this.head = 0;
        this.tail =0;
        isFull = false;

        integerQueue = new LinkedList<>();
        limit = size;
    }

    public void enqueue(int element){

        if(head ==0 && tail == array.length ){
            System.out.println("full 1");
            isFull = true;
        }
        else if( tail == head-1){
            System.out.println("full 2");
            isFull = true;
        }
        else{
            //System.out.println(isFull);
           if(!isFull) {
             //System.out.println(tail + " tail ");
               if(tail >array.length-1){
                   tail =0;
                   array[tail] = element;
                   // System.out.println("*");
               }else {
                   //  System.out.println("* * ");
                   array[tail] = element;
                   tail++;}


           }
        }
    }

    public void dequeue(){
       // array[head] =0;
        isFull = false;

        head++;
    }

    public void print(){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public double next(int val){

        if(counter ==limit){
            int x = integerQueue.poll();
            sum = sum - x;


            integerQueue.add(val);
            sum = sum+val;
            return sum/counter;

        }
        else{
            counter++;
            sum = sum+val;
            integerQueue.add(val);
            return sum/counter;
        }





    }

}
