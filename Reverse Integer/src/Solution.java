public class Solution {
    public int reverse(int x){
        int newX = Math.abs(x);
        int numDigits = String.valueOf(newX).length();
        int res = 0;
        for (int i=0; i<numDigits; i++){
            if (newX/10 != 0){
                int rest = newX%10;
                res += rest;
                res *= 10;
                newX = newX/10;
            }
            else
                res += newX;
        }
        return (x<0) ? (res * -1) : res;
    }
}