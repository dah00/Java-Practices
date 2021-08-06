import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        pq.add('a');
        pq.add('z');
        pq.add('g');
        pq.add('e');
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }

/*    static int prims(int n, List<List<Integer>> edges, int start){

        Scanner scanner = new Scanner(System.in);
        while(edges.get(0).{

        }
    }*/

}
