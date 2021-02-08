package Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []arr = {2,4,6,8,10};
        int gcd = 0;

        // Sort the arr
        Arrays.sort(arr);

        // test each divisor number possible from 1 the minimum value of
        // the arr
        int divisor = arr[0];

        //iterate through arr
        while(divisor<=arr[arr.length-1]){
            boolean test = false;
            for (int element : arr ) {
                if(!(element%divisor == 0)){
                    continue;
                }
                divisor++;
            }
            // if the divisor divides all the number of the elements of the arr
            // store check in the gcd if gcd<divisor
            gcd = divisor;
        }
        System.out.print(gcd);
    }


}

