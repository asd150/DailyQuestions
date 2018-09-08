package WallsAndGates;

import java.util.Arrays;

public class WallsMain {
    public static void main(String[] args) {
        WallsClass wallsClass = new WallsClass();
        int[][] arr = {{2147483647, -1, 0, 2147483647}, {2147483647, 2147483647, 2147483647, -1}, {2147483647, -1, 2147483647, -1}, {0, -1, 2147483647, 2147483647}};

     System.out.print(Arrays.toString(Arrays.asList(wallsClass.wallsNGate(arr)).get(0)));
    }
}
