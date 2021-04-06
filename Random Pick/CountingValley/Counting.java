package CountingValley;

public class Counting {
    public static int countingValleys(int steps, String path) {
        int valley = 0;
        int level = 0;

        for (int index=0; index<steps; index++){
            if(path.charAt(index)=='U')
                level++;
            if (path.charAt(index)=='D')
                level--;

            if (level==0 && path.charAt(index)=='U')
                valley++;
        }
        return valley;
    }
}
