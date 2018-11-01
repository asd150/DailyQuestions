package DetectCycleLL;

import java.util.HashMap;
import java.util.Map;

public class DetectClass {

    public void sol(LinkedList.Node node){
        Map<LinkedList.Node,Integer> map = new HashMap<>();
        int i=0;
        while(node!=null){
            System.out.println(node.data + " ^ " +  i + " ");
            if(!map.containsKey(node)){
                map.put(node,0);
                    node = node.next;
               //System.out.println(node.data + " " +  i);
            }
            else {
                node.next = null;
                System.out.println(node.data + " ^ " +  i + " ");
                node = node.next;
            }
            i++;

        }
    }
}
