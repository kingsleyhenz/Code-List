package basic;

import java.util.Arrays;

public class HostelAllocation {
    public static void main(String[] args){
        String[][] rooms = new String[2][4];
        rooms[0][0] = "Nadyne";
        rooms[0][1] = "Ebube";
        rooms[0][2] = "Prince";
        rooms[0][3] = "Kingsley";

        rooms[1][0] = "Obi";
        rooms[1][1] = "Jedi";
        rooms[1][2] = "Prince";
        rooms[1][3] = "Sophia";

        System.out.println(Arrays.deepToString(rooms));
    }
}
