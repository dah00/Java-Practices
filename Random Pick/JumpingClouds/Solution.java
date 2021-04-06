package JumpingClouds;

public class Solution {
    static int jumpingOnClouds(int[] c) {
        int jump = 0;
        for (int i = 0; i < c.length-1; i++) {
            if (c[i] == 0) i++;
            jump++;
        }

        return jump;

    }
}
