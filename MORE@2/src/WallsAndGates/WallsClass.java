package WallsAndGates;

import java.util.LinkedList;
import java.util.Queue;

class cell{
    int x;
     int y;
    cell(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class WallsClass {

    public int[][] wallsNGate(int[][] walls){
       int[][] move = {{1,0},{-1,0},{0,1},{0,-1}};


        //find the gates '0' and add to queue
        Queue<cell> gates = new LinkedList<>();

        for(int i=0;i<walls.length;i++){
            for(int j=0;j<walls[0].length;j++){
                if(walls[i][j] == 0){
                    gates.add(new cell(i,j));
                }
            }
        }


        //bfs from gates to rooms
        while(!gates.isEmpty()){

            cell temp = gates.poll();
            //get the coordinates of gate
            int p = temp.x;
            int q = temp.y;


            for(int i=0;i<move.length;i++){
            bfs(p + move[i][0],q + move[i][1],walls,gates,walls[p][q] +1);
            }

        }
        return walls;
    }

    private void bfs(int x,int y,int[][] room,Queue<cell> queue, int steps){

        if(x<0 || y<0 ||x>=room.length || y>=room[0].length || room[x][y] !=Integer.MAX_VALUE || room[x][y] == -1){
            return;
        }

        room[x][y] = steps;
        queue.add(new cell(x,y));

        return;
    }


}
