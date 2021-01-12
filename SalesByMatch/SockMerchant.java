package SalesByMatch;

import java.util.LinkedList;
import java.util.List;

public class SockMerchant {
    static int numberOfPair(int n, int[] ar) {
        int result=0;
        List<Integer> list = new LinkedList<>();
        for (int i=0; i<n; i++){
            list.add(i, ar[i]);
        }

        int i=0;
        do {
            for (int j=i+1; j<list.size(); j++){
                if (list.get(i)==list.get(j)) {
                    result++;
                    list.remove(i);
                    list.remove(j-1);
                    break;
                }
                else if (j==list.size()-1)
                    i++;
            }
        } while (i<list.size()-1);
        return result;
    }
}
