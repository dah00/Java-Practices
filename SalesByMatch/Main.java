package SalesByMatch;

public class Main {
    public static void main(String[] args) {
        int[] ar = {10, 10, 10 , 10, 10, 10, 10, 10, 10,
        10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        //int [] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = ar.length;

        System.out.println(SockMerchant.numberOfPair(n,ar));
    }
}
