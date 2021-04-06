public class Main {

    public static void main(String[] args) {
	    int x = -12345678;
        System.out.println(reverse(x));
    }

    private static int reverse(int x){
        int reversed = 0;

        while(x!=0){
            int pop = x%10;
            x = x/10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reversed = reversed * 10 + pop;
        }
        return reversed;

    }
}
