package Practice;

public class ShortestPath {

    // Question : Given a route cotaining 4 directions (E,W,N,S),
    // find the shortest path to reach destination
    // each step is 1 unit
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch == 'N')
                y++;
            else if (ch == 'E')
                x++;
            else if (ch == 'S')
                y--;
            else if (ch == 'W')
                x--;
        }
        double result = Math.sqrt(Math.pow(Math.abs(x - 0), 2)
                + Math.pow(Math.abs(y - 0), 2));

        System.out.println((int) result);

    }

}
