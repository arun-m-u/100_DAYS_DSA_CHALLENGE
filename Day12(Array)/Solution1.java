import java.util.*;

class Solution1 {
    public static void main(String[] args) {

        int[][] balloons = {{1,10}, {2,3}, {4,5}};
        int n = balloons.length;

        Arrays.sort(balloons, (a,b) ->
            Integer.compare(a[0],b[0]));

        int arrows = 1;
        int max = balloons[0][1];

        for(int i = 1; i < n; i++) {

            if(balloons[i][0] <= max) {
                max = Math.min(max, balloons[i][1]);
            } else {
                arrows++;
                max = balloons[i][1];
            }
        }

        System.out.println(arrows);
    }
}