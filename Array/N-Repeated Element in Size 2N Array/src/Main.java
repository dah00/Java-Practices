public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    static int repeatedNTimes(int[] nums) {
        int count[] = new int[10000];

        for(int num : nums){
            if(++count[num] == 1)
                return num;
        }

        return -1;
    }
}

