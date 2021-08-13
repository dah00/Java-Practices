import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3, n=3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }


    /*
      void merge(int A[], int m, int B[], int n) {
        int i=m-1;
		int j=n-1;
		int k = m+n-1;
		while(i >=0 && j>=0)
		{
			if(A[i] > B[j])
				A[k--] = A[i--];
			else
				A[k--] = B[j--];
		}
		while(j>=0)
			A[k--] = B[j--];
    }
     */

    static void merge(int[] nums1, int m, int[] nums2, int n){
        // i index of nums1, j index of nums2
        // while(j<n)
        // if(nums1[i]>nums2[j])
        //      move all elements on the right of index i(inclusive) to the right
        //      nums1[i] = nums2[j];
        //      j++; i++;
        //
        int i=0, j=0;
        while(j<n && i<m){
            if (nums1[i]>nums2[j]){
                m = moveRight(nums1, i, m);
                nums1[i] = nums2[j++];    // TODO check if the incrementation is correct
            }
            i++;
        }

        while(i<nums1.length && nums1[i]==0){
            nums1[i++] = nums2[j++];
        }
    }

    /**
     * Moves to the right all elements of nums1 starting at index "index"
     * @param nums1 array to be modified
     * @param index starting index
     * @param m
     * @return m+1
     */
    static int moveRight(int[] nums1, int index, int m){
        for (int i=m-1; i>=index; i--){
            nums1[i+1] = nums1[i];
        }
        return m+1;
    }
}
